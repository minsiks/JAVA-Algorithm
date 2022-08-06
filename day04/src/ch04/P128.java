package ch04;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {
		System.out.println("Start....");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(w1,w2,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("w1")) {
				System.out.println("Input number1?");
				String num1 = sc.next();
				System.out.println("Input number2?");
				String num2 = sc.next();
				
				int a = 0;
				int b = 0;
				try {		
				    a = Integer.parseInt(num1);
					b = Integer.parseInt(num2);
					
				} catch (Exception e) {
					System.out.println("Bye");
					continue;
				}
				
				if ((a>=1) && (a<=99) && (b>=1) && (b<=99) && (a<b)){
					int count = 0;
					double sum = 0.0;
					for (int i = a; i <= b; i++) {				
						sum+= i;
						count++;
					}
					System.out.println("합계:"+(sum));
					System.out.println("평균:"+(sum/count));
					System.out.println("갯수:"+(count));
				} else {
					System.out.println("Bye");
					continue;
				}


			}else if(cmd.equals("w2")) {
				System.out.print("input number?");
				String snum = sc.next();
				
				int num = 0;
				
				try {		
				    num = Integer.parseInt(snum);
				    if (num <10 || num > 99) {
				    	System.out.println("Bye 1");
						continue;
				    }
				}catch(Exception e) {
					System.out.println("Bye 2");
					continue;
				}
				Random r = new Random();
				int n = r.nextInt(num)+2;
				System.out.println("2부터 입력 받은 난수:"+n);
				
				
				int sum = 0;
				int count = 0;
				for (int i = 1; i <= n; i++) {
					if (i%2 == 1) {
						continue; 	
					} 
					sum += i;
					count++;
					System.out.println("for값:"+i);
				}
				System.out.println("합계:"+sum);
				System.out.println("평균:"+(sum/count));
			}
		}
		
		sc.close();
		System.out.println("End....");

	}

}
