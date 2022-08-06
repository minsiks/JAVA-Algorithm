package Ch05;

import java.util.Arrays;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		int ar[] = new int[5];
		Random r = new Random();
		int max =0;
		int min =99;
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(10);
			if(ar[i]>max) {
				max=ar[i];
			}
			if (ar[i]<min) {
				min=ar[i];
			}
			for (int j = 0; j < i; j++) {
				if (ar[i]==ar[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);

	}

}
