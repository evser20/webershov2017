package home;

public class Home {
	public int countBoards;
	public int countWindow;
	public int addBoard(Board n)
	{
		if (n.count < countBoards) 
			{
				countBoards -= n.count;
				return 1;
			}
		else
			return 0;
	}
	public int addWindow(Window n)
	{
		if (n.count < countWindow) 
			{
				countWindow -= n.count;
				return 1;
			}
		else
			return 0;
	}
}
