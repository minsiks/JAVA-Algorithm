package teamws;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class ws011 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(100);
		//랜덤한 값을 생성
//		System.out.println(i); //랜덤한 숫자
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) 		{
		System.out.println("값을 입력하시오");
		String x = sc.next();
		int a =0;

		if(x.equals("종료")) {
			System.out.println("종료하겠습니다");
			sc.close();
			break;
			}
		try {		
		    a = Integer.parseInt(x);
		    if (a <1 || a > 99) {
		    	System.out.println("범위 내 입력하시오");
				continue;
				
		    }
		    else if(i > a) {
		    	count++;
				System.out.println("작아요");
				continue;
			}
		    else if(i < a) {
				count++;
				System.out.println("커요.");
				continue;
			}
		    else if(i == a) {
				count++;
				System.out.println("정답");
				System.out.println(count+"번만에 성공");
				System.out.println("종료하겠습니다");
				sc.close();
				return;
			}
			
		}catch(Exception e) {
			System.out.println("숫자가 아닙니다.");
			continue;
		}
		
		
		sc.close();
		}

	}

}
