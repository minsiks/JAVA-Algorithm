package ch04;

import java.util.Scanner;

public class P1222 {

	public static void main(String[] args) {
		// Scanner 를 이용하여 1 ~ 99까지의 정수를 입력 받는다.
				// 범위를 벗어나면 Bye 프로그램 종료
				
				// 1부터 입력 받은 수까지의 합과 평균을 출력 하시오 while
				Scanner sc = new Scanner(System.in);
				System.out.println("Input Number(2~99)?");
				String snum = sc.next();
				System.out.println(snum);
				int num = 0;
				
				try {		
				    num = Integer.parseInt(snum);
				    // 2 ~ 99
				    if (num <2 || num > 99) {
				    	System.out.println("Bye 1");
						sc.close();
						return;
				    }
				}catch(Exception e) {
					System.out.println("Bye 2");
					sc.close();
					return;
				}
				
				
				
				double sum = 0.0;
				int s = 1;
				
				while(s <= num) {
					sum += s;
					s++;
				}
				
				System.out.println(sum);
				System.out.println(sum/(s-1));
				sc.close();
				

	}

}
