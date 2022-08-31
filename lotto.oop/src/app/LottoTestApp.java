package app;

import java.util.Scanner;

import frame.Customer;
import frame.Lotto;

public class LottoTestApp {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		Lotto lot = new Lotto();
		
		while(true) {
			System.out.println("Input cmd(q to quit, b to buy, d to draw, r to get results)");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("b")) {
				System.out.println("���� �ݾ��� �Է��ϼ���.");
				String stcash = sc.next();
				
				double cash;
				try {cash = Double.parseDouble(stcash);
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��ϼ���.");
					continue;
					}
				
				c.setCash(cash);
				c.buy();
				System.out.println("������ Ƽ���� " + c.getTicket() + "��, ������ " + String.format("%.2f", c.getCash()) + "���Դϴ�.");
				
			}else if(cmd.equals("d")) {
				lot.draw(c);
				System.out.println(lot.getLuckyset());
				System.out.println(lot.getMyset());
				System.out.println(lot.getResult());
				System.out.println(lot.getRank() + "��");
				
			}else if(cmd.equals("r")) {
				System.out.println("�� ��÷��: " + lot.getMoney() + "��");
			}
		}
	
		sc.close();
		System.out.println("���� ��ȸ��...");	

	}

}
