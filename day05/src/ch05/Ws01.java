package ch05;

import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
		//double �� �迭 ������ 5�� �迭�� ����� 0.0 ~ 10.0 ������ ������ ���� �ִ´�.
		//���� ��� �Ѵ�.
		Random r = new Random();
		double dr [] = new double[5];
		for (int i = 0; i < dr.length; i++) {
			dr[i] = r.nextInt(11);
			System.out.println(dr[i]);
		}

		

	}

}
