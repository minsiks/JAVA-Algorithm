package Bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Start....");
		Scanner sc = new Scanner(System.in);
		Bank bank = null;
		
		
		while(true) {
			System.out.println("Input cmd(c,d,w,b,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("c")) {
				System.out.println("Input name ..");
				String name = sc.next();
				System.out.println("Input accNo..");
				String accNo = sc.next();
				
				bank = new Bank(accNo, name, 0);
				System.out.println(bank);
				
			}else if(cmd.equals("d")) {
				System.out.println("+$ ..?");
				double deposit = Double.parseDouble(sc.next());
				bank.deposit(deposit);
				System.out.println(bank.toString());
				
			}else if(cmd.equals("w")) {
				System.out.println("-$ ..?");
				double withdraw = Double.parseDouble(sc.next());
				bank.withdraw(withdraw);
				System.out.println(bank.toString());
							
			}else if(cmd.equals("b")) {
				System.out.println(bank);
			}
		}
		
		sc.close();
		System.out.println("End....");
	}
}
