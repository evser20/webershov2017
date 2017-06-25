import java.util.Scanner;
import java.util.Arrays;
public class Task7 {

	public static void main(String[] args) {
		System.out.print("Take string ");
		String line = new Scanner(System.in).nextLine();
		String[] words = line.split("\\s+"); // разделяем строку на слова
		System.out.println("Unsorted: " + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("Sorted: " + Arrays.toString(words));


	}

}
