package ch05;

import java.util.Iterator;

public class Ws04 {

	public static void main(String[] args) {
		//이차원 배열에 3명의 학생들의 점수가 있다.
		//학생 별 점수를 출력 한다.
		//전체 점수의 합과 평균을 구하시오
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
			System.out.println(" - 학생");
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
		System.out.printf("명훈이 합계 : %d \n", sum1);
		System.out.printf("동석이 합계 : %d \n", sum2);
		System.out.printf("지훈이 합계 : %d \n", sum3);
		System.out.printf("명훈이 평균 : %d \n", sum1/count);
		System.out.printf("동석이 평균 : %d \n", sum2/count);
		System.out.printf("지훈이 평균 : %d \n", sum3/count);
		
		int ar2[] = new int[3];
		ar2[0] = sum1/count;
		ar2[1] = sum2/count;
		ar2[2] = sum3/count;
		for (int i = 0; i < ar2.length; i++) {
			System.out.printf("%d \t", ar2[i]);
		}
	} 
	
	//option : 학생별 평균을 새로운 배열을 만들어 넣고 출력 하시오.
	

}
