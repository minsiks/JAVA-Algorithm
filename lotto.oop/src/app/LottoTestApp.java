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
				System.out.println("충전 금액을 입력하세요.");
				String stcash = sc.next();
				
				double cash;
				try {cash = Double.parseDouble(stcash);
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요.");
					continue;
					}
				
				c.setCash(cash);
				c.buy();
				System.out.println("소유한 티켓은 " + c.getTicket() + "장, 현금은 " + String.format("%.2f", c.getCash()) + "원입니다.");
				
			}else if(cmd.equals("d")) {
				lot.draw(c);
				System.out.println(lot.getLuckyset());
				System.out.println(lot.getMyset());
				System.out.println(lot.getResult());
				System.out.println(lot.getRank() + "등");
				
			}else if(cmd.equals("r")) {
				System.out.println("총 당첨금: " + lot.getMoney() + "원");
			}
		}
	
		sc.close();
		System.out.println("다음 기회에...");	

	}

}
