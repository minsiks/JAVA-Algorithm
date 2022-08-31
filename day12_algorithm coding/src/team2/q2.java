package team2;

import java.util.Arrays;
import java.util.Random;

public class q2 {

	public static void main(String[] args) {
		int i[] = new int[6];
		Random r = new Random();
		int result = 0;
		
		for (int j = 0; j < i.length; j++) {
			i[j] = r.nextInt(9)+1;
			for (int k = 0; k < j; k++) {
				if(i[j]==i[k]) {
					j--;
				}
				
			}
			
		}
		
		for (int j = 0; j < i.length; j++) {
			result += i[j];
		}
		System.out.println(Arrays.toString(i));
		System.out.println("들어가지않은 값의 합:"+((9+8+7+6+5+4+3+2+1)-result));
	}

}
