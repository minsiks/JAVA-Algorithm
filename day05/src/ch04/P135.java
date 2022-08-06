package ch04;

import java.util.Scanner;

public class P135 {

	public static void main(String[] args) {
		System.out.println("Start....");
		double balance = 10000.0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(d,w,s,q,i) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("d")) {
				System.out.println("Deposit..");
				System.out.println("Amount:");
				String snum = sc.next();
				int num =0;
				try {		
				    num = Integer.parseInt(snum);
				    if (num<0){
				    	System.out.println("please Input over zero");
						continue;
				    }
				}catch(Exception e) {
					System.out.println("Input only number");
					continue;
				}
				System.out.println("Now Acoount: "+(balance + num));
				balance = (balance + num);
				
			}else if(cmd.equals("w")) {
				System.out.println("withdraw..");
				System.out.println("Amount:");
				String snum = sc.next();
				int num =0;
				try {		
				    num = Integer.parseInt(snum);
				    if (num>balance){
				    	System.out.println("please Input less than now account");
				    	continue;
				    }
				}catch(Exception e) {
					System.out.println("Input only number");
					continue;
				}
				System.out.println(balance-num);
				balance = (balance-num);
				
			}else if(cmd.equals("s")) {
				System.out.println("select Balance..");
				System.out.println("Now : " +balance);
				
			}else if(cmd.equals("i")) {
				//�������� �Է� �ϸ� ���ڰ� ������ ��� �Ͻÿ�
				//���ݰ� ���� �������� ���� ��� �Ͻÿ�
				System.out.println("interest rate..(If you enter '5', '5%')");
				String snum = sc.next();
				System.out.println(snum);
				double amount = Double.parseDouble(snum);
				double interest = (balance*(amount /100));
				System.out.printf("���� :%.2f \n ����: %.2f \n ������ :%.2f %% \n ",balance,interest,amount);
			}
		}
		
		sc.close();
		System.out.println("End....");

	}

}
