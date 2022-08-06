package ch05;

import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
		//double 형 배열 사이즈 5인 배열을 만들고 0.0 ~ 10.0 사이의 랜덤한 값을 넣는다.
		//값을 출력 한다.
		Random r = new Random();
		double dr [] = new double[5];
		for (int i = 0; i < dr.length; i++) {
			dr[i] = r.nextInt(11);
			System.out.println(dr[i]);
		}

		

	}

}
