package Ws;

import java.util.Arrays;
import java.util.Random;

public class ws21 {

	public static void main(String[] args) {
		int ar[] = new int[5];
		Random r = new Random();
		int max =0;
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(5);
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(max);
	}
	


}
