package ch04;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input number?");
		String snum = sc.next();
		
		int num = 0;
		
		try {		
		    num = Integer.parseInt(snum);
		    if (num <10 || num > 99) {
		    	System.out.println("Bye 1");
				sc.close();
				return;
		    }
		}catch(Exception e) {
			System.out.println("Bye 2");
			sc.close();
			return;
		}
		Random r = new Random();
		int n = r.nextInt(num)+2;
		System.out.println("2���� �Է� ���� ����:"+n);
		
		
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2 == 1) {
				continue; 	
			} 
			sum += i;
			count++;
			System.out.println("for��:"+i);
		}
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+(sum/count));
		sc.close();
		
	}

}
