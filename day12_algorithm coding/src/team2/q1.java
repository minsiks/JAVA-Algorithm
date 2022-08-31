package team2;

import java.util.Random;

public class q1 {

	public static void main(String[] args) {
		int i[] = new int[5];
		
		Random r = new Random();
		
		int max = 0;
		int min = 99;
		
		for (int j : i) {
			j = r.nextInt(99)+1;
			System.out.println(j);
			if(max < j) {
				max = j;			
			}
			if(min> j) {
				min = j;
			}
			
		}

		System.out.println("max=" + max);	
		System.out.println("min=" + min);	
	}

}
