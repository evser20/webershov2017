import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1 = in.nextDouble(), num2 = in.nextDouble();
		System.out.println(Math.abs(num1-10) > Math.abs(num2-10) ? num2 : num1);
	}

}
