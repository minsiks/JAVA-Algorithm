package Ws;

import java.util.Random;
import java.util.Scanner;

public class q011 {

public static void main(String[] args) {
		
		// 9x9 배열
		int ar [][] = new int[9][9];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		// 0, 1 랜덤으로 넣고 출력
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = r.nextInt(2);
				System.out.printf("%d \t",ar[i][j]);
					}
			System.out.println("");
			}
			
		// 좌표 (n,m)에서 n과 m에 각각 0~8의 정수 입력하기
		// (n,m)=1이면 "보물을 발견했습니다!" 출력 후 프로그램 종료,
		// (n,m)=0이면 "빈 땅입니다. 다시 시도하세요" 출력 후 n, m 입력부터 재시작
		while(true) {
			System.out.println("(n,m)에 위치한 수가 1이면 보물을 찾을 수 있습니다.");
			
			System.out.println("");
			System.out.println("n에 들어갈 수를 입력하세요(0~8)");
			String x = sc.next();
			
			System.out.println("m에 들어갈 수를 입력하세요(0~8)");
			String y = sc.next();
		
			
			// 제어: 문자 입력 시

			int i;
			int j;
			try {i = Integer.parseInt(x);
				j = Integer.parseInt(y);
			} catch (Exception e) {
				System.out.println("숫자가 아닙니다.");
				return;}
				

		
			// 보물 판별
			
			int n = Integer.parseInt(x);
			int m = Integer.parseInt(y);
			
			if (n<0 && n>8 && m<0 && m>8) {
				System.out.println("범위 내 숫자를 입력하시오.");
				
			}
			
			if(ar[n][m] == 0) {
			System.out.println("빈 땅입니다. 다시 시도하세요.");
			}else {
			System.out.println("보물을 찾았습니다!");
			break;}
			
		}

				

			
				
				
				

			
			

			
	// 제어
//			int a;
//			int b;
//			try {a = Integer.parseInt(x);
//					b = Integer.parseInt(y);
//			} catch (Exception e) {
//				System.out.println("숫자가 아닙니다.");
//				i--;
//				continue;
//				}
//		
//			// x = a = j
//			
//		if(ar[i][j] == 1) {
//			System.out.println("보물을 찾았습니다!");
//			sc.close();
//			return;
//			}else {
//			System.out.println("빈 땅입니다. 다시 시도하세요.");
//				}
//		
		
//		;
//		
//		// 확인
//		System.out.println(ar[0][0]);
//		
//		
//
//		//
		sc.close();
		System.out.println("End");		
	}
}
