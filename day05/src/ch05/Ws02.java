package ch05;

import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		//int형 배열 사이즈 10인 배열을 만들고 1~99까지의 랜덤한 숫자를 입력한다.
		// 배열의 값이 홀수의 값들만의 합과 평균을 구한다.
		
		int ar [] = new int [10];
		Random r = new Random();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100);
			if(ar[i]%2 == 1) {
				System.out.println(ar[i]);
				sum += ar[i];
				count++;
			}
		}			
		System.out.println("합계는?"+sum);
		System.out.println("평균은?"+(sum/count));

	}

}
