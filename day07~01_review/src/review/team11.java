package review;

import java.util.Scanner;

public class team11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		String a1 = sc.next();
		int a2 = Integer.parseInt(a1);
		String b1 = sc.next();
		int b2 = Integer.parseInt(b1);
		String c1 = sc.next();
		int c2 = Integer.parseInt(c1);
		String d1 = sc.next();
		int d2 = Integer.parseInt(d1);
		String e1 = sc.next();
		int e2 = Integer.parseInt(e1);
		try {
			if (a2 <= 1
					&& b2 == a2+1
					&& c2 == b2+1
					&& d2 == c2+1
					&& e2 == e2+1
					) {
				
			}
			
		} catch (Exception e) {
			System.out.println("입력오류");
		}
	
	
		sc.close();
	}
	
	

}
