package ch04;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		// Scanner �� �̿��Ͽ� 1 ~ 99������ ������ �Է� �޴´�.
		// ������ ����� Bye ���α׷� ����
		
		// 1���� �Է� ���� �������� �հ� ����� ��� �Ͻÿ� while
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number(2~99)?");
		String snum = sc.next();
		System.out.println(snum);
		int i =0;
		i = Integer.parseInt(snum);
		
		if (i <= 2 || i >= 99); {
			System.out.println("Bye");
	        sc.close();
	    	return;
	    
	    
		}
	}

	
	
}
