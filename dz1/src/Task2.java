import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = b*b-4*a*c;
	System.out.println(d > 0 ? (-b+Math.sqrt(d))/(2*a)+"\n"+(-b-Math.sqrt(d))/(2*a) : "NO");
}

}