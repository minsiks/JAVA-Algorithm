package Backjoon0806;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a>=90&&a<=100) {
			System.out.println("A");
		}else if (a>=80&&a<=89) {
			System.out.println("B");
		}else if (a>=70&&a<=79) {
			System.out.println("C");
		}else if (a>=60&&a<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
