package Backjoon0831;

import java.util.Scanner;

public class Main3_14 {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
			
		int N = in.nextInt();
		int b = 0;
		int T = N;
		while (true) {
			N = ((N%10)*10)+(((N/10)+(N%10))%10);
			b++;
			if (T==N) {
				break;
			}
		}
		System.out.println(b);
	}
}
 