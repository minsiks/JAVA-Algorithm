package Ws;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
				int score1=0;
				int score2=0;
				int score3=0;
				System.out.println("점수를 입력하시오(1-99)");
				Scanner sc = new Scanner(System.in);
				System.out.print("첫번쨰 점수 : ");
				score1 = sc.nextInt();
				System.out.print("두번쨰 점수 : ");
				score2 = sc.nextInt();
				System.out.print("세번쨰 정수 : ");
				score2 = sc.nextInt();
				System.out.print("세점수의 평균   : ");
				//범위를 벗어나면 종료
				if( score1 > 1 && score1 < 100 &&
						score2 > 1 && score2 < 100 
						&& score3 >1&&score3<100 ) {
					System.out.println("점수입력범위는1-99입니다 다시입력하세요");
				    sc.close();
				    return;
				}
				
				System.out.println((score1+score2+score3)/3);

	}

}
