package ch04;

import java.util.Scanner;

public class Wss01 {

	public static void main(String[] args) {
		//1. �ΰ��� ���ڸ� Scanner�� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num1:");
		String snum1 = sc.next();
		System.out.println("Input num2:");
		String snum2 = sc.next();
		
		// ����: �μ��� �����̾�� �ϸ� 1~99 ������ ���� �̾���Ѵ�
		//            ù��° ���ڴ� �ι�° ���ں��� �۾ƾ� �Ѵ�.
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(snum1);
			num2 = Integer.parseInt(snum2);	
		}catch(Exception e) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		if((num1 < 1 || num1 > 99) || (num2 < 1 || num2 > 99) || num1 > num2) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		//2. ù��° ���ں��� �ι�°������ �հ� ����� ���Ͻÿ�
		double sum = 0.0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
			
		}
		
		System.out.println(sum);
		System.out.println(sum/(Math.abs(num1-num2)+1));
		
		
		
		
		
		sc.close();

	}

}
