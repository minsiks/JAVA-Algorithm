package ch05;

import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		//int�� �迭 ������ 10�� �迭�� ����� 1~99������ ������ ���ڸ� �Է��Ѵ�.
		// �迭�� ���� Ȧ���� ���鸸�� �հ� ����� ���Ѵ�.
		
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
		System.out.println("�հ��?"+sum);
		System.out.println("�����?"+(sum/count));

	}

}
