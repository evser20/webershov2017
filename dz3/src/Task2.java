
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String text = "slidfhsa as;dfnsalkn sad sdan ksldan ksdan jkfsdna jkabs jdkbf asdfasbdkj baskd b";
        String[] strings = text.split("\\. ");

        String[] max = new String[0];
        for (int i = 0; i < strings.length; i++){
            String [] arr = strings[i].split(" ");

            if (arr.length > max.length){
                max = arr;
            }
        }
        
        String[][] matrix = new String[strings.length][max.length];

        for (int i = 0; i < strings.length; i++) {
            String[] arr = strings[i].split(" ");
            for (int j = 0; j < max.length; j++) {
                if (j < arr.length) {
                    matrix[i][j] = arr[j];
                } else {
                    matrix[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < max.length; j++) {
                System.out.print("" + matrix[i][j] + " | ");
            }
            System.out.println("\n");
        }
        Scanner data = new Scanner(System.in);
        String str = data.next();

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if (matrix[i][j].equals(str)) {
                    System.out.println( str + ", i = " + i + ", j = " + j);
                }
            }
        }
    }
}
