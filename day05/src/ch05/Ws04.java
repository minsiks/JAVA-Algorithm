package ch05;

import java.util.Iterator;

public class Ws04 {

	public static void main(String[] args) {
		//������ �迭�� 3���� �л����� ������ �ִ�.
		//�л� �� ������ ��� �Ѵ�.
		//��ü ������ �հ� ����� ���Ͻÿ�
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int count = 0;
		int ar[][] = new int[3][4];
		ar[0][0] = 100;
		ar[0][1] = 99;
		ar[0][2] = 80;
		ar[0][3] = 70;
		ar[1][0] = 98;
		ar[1][1] = 91;
		ar[1][2] = 83;
		ar[1][3] = 72;
		ar[2][0] = 89;
		ar[2][1] = 96;
		ar[2][2] = 82;
		ar[2][3] = 75;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t", ar[i][j]);
			}
			System.out.println(" - �л�");
		}
	
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if(ar[i]!=ar[0]){
					continue;
				}
				sum1 += ar[0][j];
				sum2 += ar[1][j];
				sum3 += ar[2][j];
				count++;
			}

		}			
		System.out.printf("������ �հ� : %d \n", sum1);
		System.out.printf("������ �հ� : %d \n", sum2);
		System.out.printf("������ �հ� : %d \n", sum3);
		System.out.printf("������ ��� : %d \n", sum1/count);
		System.out.printf("������ ��� : %d \n", sum2/count);
		System.out.printf("������ ��� : %d \n", sum3/count);
		
		int ar2[] = new int[3];
		ar2[0] = sum1/count;
		ar2[1] = sum2/count;
		ar2[2] = sum3/count;
		for (int i = 0; i < ar2.length; i++) {
			System.out.printf("%d \t", ar2[i]);
		}
	} 
	
	//option : �л��� ����� ���ο� �迭�� ����� �ְ� ��� �Ͻÿ�.
	

}
