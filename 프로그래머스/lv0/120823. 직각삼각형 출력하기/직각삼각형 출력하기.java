import java.util.Scanner;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] sis = new String[n];
        String ab= "";
        for (int i = 0; i < sis.length; i++) {
			ab+="*";
        	sis[i]=ab;
		}
        Stream.of(sis).forEach(System.out::println);
		sc.close();
    }
}