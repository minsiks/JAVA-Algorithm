package ch05;

import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
		//int �� �迭 �������� 6�� �迭�� ����� 1~6 ������ ���� �Է��Ѵ�
		//��, �ߺ����� �ʰ� �Է� �Ѵ�. ���� ����Ѵ�
		
		int ar [] = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(6)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}	
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
