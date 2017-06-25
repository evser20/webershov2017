import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(), indRows = -1, indCols = -1;
		int a[][] = new int[5][5];
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				a[i][j] = (int) (Math.random() * 100);
				if(a[i][j] == num)
				{
					indRows = i;
					indCols = j;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		if(indRows == -1)
			System.out.println("NO");
		else
			System.out.println(indRows+" "+indCols);
	}

}
