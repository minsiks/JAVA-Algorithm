package Backjoon0806;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt()-45;
		
		int h = 0;
		int m = 0;
		String a = null;
		if (M<0&&H-1>=0) {
			h = H-1;
			m = M+60;
			a = "1";
		}else if (M>=0&&H>=0) {
			m = M;
			h = H;
			a = "2";
		}else if (M<0&&H-1<0) {
			h = H-1+24;
			m = M+60;
			a = "3";
		}else {
			h = H-1;
			m = M+60;
			a = "4";
		}
		
		System.out.println(h+" "+m);
		
	}

}
