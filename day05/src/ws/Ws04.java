package ws;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
		int ar[][] = {
				{100,99,80,70}, 
				{98,91,83,72}, 
				{89,96,82,75}
				
		};
		System.out.println(ar.length);
		System.out.println(ar[1].length);

		double sum = 0.0;
		
		
		double as[] = new double[ar.length];
		
		
		for (int i = 0; i < ar.length; i++) {
			double sum2 = 0.0;
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t", ar[i][j]);
				sum += ar[i][j];
				sum2 += ar[i][j];

			}
			as[i] = sum2/(ar[i].length);
			System.out.println("");
		}
		System.out.println("-"+Arrays.toString(as));
		
		System.out.println(sum);
		System.out.println(sum/(ar.length*ar[0].length));
	}

}
