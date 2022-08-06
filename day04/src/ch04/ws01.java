package ch04;

import java.util.Scanner;

public class ws01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input number1?");
		String num1 = sc.next();
		System.out.println("Input number2?");
		String num2 = sc.next();
		
		int a = 0;
		int b = 0;
		try {		
		    a = Integer.parseInt(num1);
			b = Integer.parseInt(num2);
			
		} catch (Exception e) {
			System.out.println("Bye");
			sc.close();
			return;
		}

		
		if ((a>=1) && (a<=99) && (b>=1) && (b<=99) && (a<b)){
			int count = 0;
			double sum = 0.0;
			for (int i = a; i <= b; i++) {				
				sum+= i;
				count++;
			}
			System.out.println("ÇÕ°è:"+(sum));
			System.out.println("Æò±Õ:"+(sum/count));
			System.out.println("°¹¼ö:"+(count));
		} else {
			System.out.println("Bye");
			sc.close();
			return;
		}sc.close();


	}

}
