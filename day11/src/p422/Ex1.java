package p422;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String num = sc.next();
		int n = 0;
		try {
			n = Integer.parseInt(num);
		}catch(Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		System.out.println(n);
		int result = 0;
		try {
			result = 100 / n;
		}catch(ArithmeticException e) {
			System.out.println("�и� 0 �Դϴ�.");
		}
		System.out.println(result);
		sc.close();
	}
}
