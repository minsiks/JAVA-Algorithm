package Backjoon0830;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		in.close();
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
