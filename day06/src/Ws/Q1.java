package Ws;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
				int score1=0;
				int score2=0;
				int score3=0;
				System.out.println("������ �Է��Ͻÿ�(1-99)");
				Scanner sc = new Scanner(System.in);
				System.out.print("ù���� ���� : ");
				score1 = sc.nextInt();
				System.out.print("�ι��� ���� : ");
				score2 = sc.nextInt();
				System.out.print("������ ���� : ");
				score2 = sc.nextInt();
				System.out.print("�������� ���   : ");
				//������ ����� ����
				if( score1 > 1 && score1 < 100 &&
						score2 > 1 && score2 < 100 
						&& score3 >1&&score3<100 ) {
					System.out.println("�����Է¹�����1-99�Դϴ� �ٽ��Է��ϼ���");
				    sc.close();
				    return;
				}
				
				System.out.println((score1+score2+score3)/3);

	}

}
