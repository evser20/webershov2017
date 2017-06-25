
public class Task4 {

	public static void main(String[] args) {
		int[][] a = new int[8][5];
		int max = 0;
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = 10 + (int) (Math.random() * 90);
				if (a[i][j] > max) max = a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMax - "+max);
	}

}
