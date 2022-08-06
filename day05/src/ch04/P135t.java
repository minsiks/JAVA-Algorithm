package ch04;

import java.util.Scanner;

public class P135t {

	public static void main(String[] args) {
		System.out.println("Start....");
		double balance = 10000.0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(d,w,s,i,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("d")) {
				System.out.println("Deposit..");
				System.out.println("Amount:");
				String snum = sc.next();
				int amount = Integer.parseInt(snum);
				if (amount < 0) {
					System.out.println("음수입니다. 다시진행하세요");
					continue;
				}
				balance += amount;
				System.out.println("Now Acoount: "+(balance - amount));
				
			}else if(cmd.equals("w")) {
				System.out.println("withdraw..");
				System.out.println("Amount:");
				String snum = sc.next();
				System.out.println(snum);
				int amount = Integer.parseInt(snum);
				if (amount < 0) {
					System.out.println("음수입니다. 다시진행하세요");
					continue;
				}
				if (amount > balance) {
					System.out.println("잔액부족. 다시진행하세요");
					continue;
				}
				balance -= amount;
				System.out.println("Now Acoount: "+(balance - amount));
				
			}else if(cmd.equals("s")) {
				System.out.println("select Balance..");
				System.out.println("Now : " +balance);
				
			}else if(cmd.equals("i")) {
				//이자율을 입력 하면 이자가 얼마인지 출력 하시오
				System.out.println("이자율입력");
				String sinterest = sc.next();
				double interestRate = Double.parseDouble(sinterest);
				double interest = balance * (interestRate / 100);
				System.out.printf("원금 : %.2f 이자 : %.2f  이자율 : %.2f %% \n ",balance,interest,interestRate);
			}
		}
		
		sc.close();
		System.out.println("End....");

	}

}
