import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short num1 = in.nextShort(), num2 = in.nextShort();
		for (int i = num1; i <= num2; i++)
		{
			System.out.print((char)i+" ");
		}

	}

}
