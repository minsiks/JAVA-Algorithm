package Lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoApp {

	public static void main(String[] args) {
	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		
		int lotto_success[] = new int[6];
		
				
		
		while(true) 		{
			
				for(int i=0; i<lotto_success.length; i++) {
					lotto_success[i] = r.nextInt(45)+1;
//					System.out.println(lotto_success[i]);
					for(int j=0; j<i; j++) {
						if(lotto_success[i] == lotto_success[j]) {
							i--;
						}
					}
					System.out.println("���� �Է��Ͻÿ�");
					String a = sc.next();
					System.out.println("���� �Է��Ͻÿ�");
					String b = sc.next();
					System.out.println("���� �Է��Ͻÿ�");
					String c = sc.next();
					System.out.println("���� �Է��Ͻÿ�");
					String d = sc.next();
					System.out.println("���� �Է��Ͻÿ�");
					String e = sc.next();
					System.out.println("���� �Է��Ͻÿ�");
					String f = sc.next();
								
			}	
				
				sc.close();		
		}
		
	}
}
