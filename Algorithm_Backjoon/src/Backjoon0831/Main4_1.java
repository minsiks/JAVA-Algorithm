package Backjoon0831;

import java.util.Arrays;
import java.util.Scanner;

public class Main4_1 {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
			
		int N = in.nextInt();
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(array);
		System.out.print(array[0]+" "+array[N-1]);
	}
}
 