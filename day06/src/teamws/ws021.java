package teamws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ws021 {

	public static void main(String[] args) {
			int lotte_my[] = new int[6];
			int lotte_success[] = new int[6];

			Random r = new Random();
			int count = 0;

			Scanner input = new Scanner(System.in);


			try {
				for(int i=0; i<lotte_success.length; i++) {
					lotte_success[i] = r.nextInt(45)+1;
					System.out.println(lotte_success[i]);
					for(int j=0; j<i; j++) {
						if(lotte_success[i] == lotte_success[j]) {
							i--;
						}
					}

				}

				


				for(int k = 0; k < lotte_my.length; k++) {
					System.out.print("�ζ� ���� �Է� : ");
					lotte_my[k] = input.nextInt();//���߱� ���� ���� �Է�

					if(lotte_my[k] < 0 || lotte_my[k] > 45) {
						System.out.println("������ �ʰ��߾��. ");
						k--;
					}

					for(int a=0; a < k; a++) {
						if(lotte_my[k] == lotte_my[a]) {// �Է��� ���� �ߺ��� ��� ����
							System.out.println("�ߺ��Ǵ� ���� �Է��ϼ̾��. �ٽ��Է¹޽��ϴ�. ");
							k--;//�ߺ��̸� �ٽ� �Է¹ޱ� 
						}

					}

				}

				for(int q = 0; q < lotte_success.length; q++) {//���� ���纸�� 
					for(int l=0; l<lotte_my.length; l++) {
						if(lotte_success[q] == lotte_my[l]) {//������ 
							System.out.println(lotte_my[l] + "�� ������!");
							count++;//���� ���� ī���� 
						}
					}

				}	

				System.out.println("�� "+ count + "���� �­����.");			
				System.out.println();
				if(count == 0) {
					System.out.println("��");   

				}else if(count == 6) {
					System.out.println("1��");

				}else if(count == 5) {
					System.out.println("2��");   

				}else if(count == 4) {
					System.out.println("3��");   

				}else if(count == 3){	        	  
					System.out.println("4��");

				}else {
					System.out.println("5��");
				}




			}catch(Exception e) {
							System.out.println("���� �Է����� �����մϴ�. ");
//				System.out.println(e.getMessage());
			}


		}

	

	}

