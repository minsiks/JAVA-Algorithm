package Ws;

import java.util.Random;
import java.util.Scanner;

public class q011 {

public static void main(String[] args) {
		
		// 9x9 �迭
		int ar [][] = new int[9][9];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		// 0, 1 �������� �ְ� ���
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = r.nextInt(2);
				System.out.printf("%d \t",ar[i][j]);
					}
			System.out.println("");
			}
			
		// ��ǥ (n,m)���� n�� m�� ���� 0~8�� ���� �Է��ϱ�
		// (n,m)=1�̸� "������ �߰��߽��ϴ�!" ��� �� ���α׷� ����,
		// (n,m)=0�̸� "�� ���Դϴ�. �ٽ� �õ��ϼ���" ��� �� n, m �Էº��� �����
		while(true) {
			System.out.println("(n,m)�� ��ġ�� ���� 1�̸� ������ ã�� �� �ֽ��ϴ�.");
			
			System.out.println("");
			System.out.println("n�� �� ���� �Է��ϼ���(0~8)");
			String x = sc.next();
			
			System.out.println("m�� �� ���� �Է��ϼ���(0~8)");
			String y = sc.next();
		
			
			// ����: ���� �Է� ��

			int i;
			int j;
			try {i = Integer.parseInt(x);
				j = Integer.parseInt(y);
			} catch (Exception e) {
				System.out.println("���ڰ� �ƴմϴ�.");
				return;}
				

		
			// ���� �Ǻ�
			
			int n = Integer.parseInt(x);
			int m = Integer.parseInt(y);
			
			if (n<0 && n>8 && m<0 && m>8) {
				System.out.println("���� �� ���ڸ� �Է��Ͻÿ�.");
				
			}
			
			if(ar[n][m] == 0) {
			System.out.println("�� ���Դϴ�. �ٽ� �õ��ϼ���.");
			}else {
			System.out.println("������ ã�ҽ��ϴ�!");
			break;}
			
		}

				

			
				
				
				

			
			

			
	// ����
//			int a;
//			int b;
//			try {a = Integer.parseInt(x);
//					b = Integer.parseInt(y);
//			} catch (Exception e) {
//				System.out.println("���ڰ� �ƴմϴ�.");
//				i--;
//				continue;
//				}
//		
//			// x = a = j
//			
//		if(ar[i][j] == 1) {
//			System.out.println("������ ã�ҽ��ϴ�!");
//			sc.close();
//			return;
//			}else {
//			System.out.println("�� ���Դϴ�. �ٽ� �õ��ϼ���.");
//				}
//		
		
//		;
//		
//		// Ȯ��
//		System.out.println(ar[0][0]);
//		
//		
//
//		//
		sc.close();
		System.out.println("End");		
	}
}
