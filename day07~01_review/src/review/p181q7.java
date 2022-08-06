package review;

import java.util.Arrays;

public class p181q7 {

	public static void main(String[] args) {
		int max = 0;
		int[] arry = {1,5,3,8,2};
		
		
		for (int i = 0; i < arry.length; i++) {
			if(arry[i]>max) {
				max = arry[i];
			}
		}
		System.out.println(Arrays.toString(arry));
		
		System.out.println("max: "+max);

	}

}
