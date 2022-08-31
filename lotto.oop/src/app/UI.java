package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import frame.Customer;
import frame.Lotto;





public class UI {

	Customer c = new Customer();
	Lotto lot = new Lotto();

	
		
		Frame f;
		Button b1, b2, b3, b4, b5;
		Panel p1, p2, p3, p4, p5, p6, statusp, buttonp;
		Panel titlep, cashp, warnp;
		Panel mainp;
		List list2, list3, list4, list5, list6;
		Label titlel, tl1, tl3, cashl, ticketl, setsl, moneyl;
		TextField tf1;
		
		
		public UI() {
		
			init();
			make();
			addevent();
		}
		
		public void init() {
			f = new Frame("My frame");
			b1 = new Button("1. 충전하기");
			b2 = new Button("2. Test your luck!");
			b3 = new Button("3. 당첨금 확인하기");
			b4 = new Button("Warnings!");
			b5 = new Button("초기화");
			
			p1 = new Panel();
			p2 = new Panel();
			p3 = new Panel();
			p4 = new Panel();
			p5 = new Panel();
			p6 = new Panel();
			titlep = new Panel();
			mainp = new Panel();
			statusp = new Panel();
			buttonp = new Panel();
			cashp = new Panel();
			warnp = new Panel();
			
		
			list2 = new List();
			list3 = new List();
			list4 = new List();
			list5 = new List();
			list6 = new List();
	
			titlel = new Label("로또 추첨기(충전 금액을 입력한 후 아래의 버튼을 클릭하세요.)");
			tl1 = new Label();
			tl3 = new Label();
			
			cashl = new Label("Cash");
			ticketl = new Label("Ticket");
			setsl = new Label("Draw");
			moneyl = new Label("Prize");
			
			tf1 = new TextField("충전 금액을 입력하세요.");
			
		}
		
		public void make() {

			p1.setBackground(new Color(228, 232, 240));
			titlel.setAlignment(Label.CENTER);
			
			b1.setBackground(new Color(105, 150, 255));
			b2.setBackground(new Color(143, 176, 255));
			b3.setBackground(new Color(191, 205, 255));
			b4.setBackground(new Color(214, 226, 255));
			
			p1.setLayout(new GridLayout(3, 1));
			p1.add(tl1, "North");
			p1.add(titlel, "Center");
			p1.add(tl3, "South");
			
			cashl.setBackground(new Color(255, 237, 97));
			ticketl.setBackground(new Color(255, 237, 97));
			setsl.setBackground(new Color(255, 237, 97));
			moneyl.setBackground(new Color(255, 237, 97));
			
			cashl.setAlignment(Label.CENTER);
			ticketl.setAlignment(Label.CENTER);
			setsl.setAlignment(Label.CENTER);
			moneyl.setAlignment(Label.CENTER);
			
			p2.setLayout(new GridLayout(2,1));
			p2.add(cashl, "North");
			p2.add(list2);
			
			p3.setLayout(new GridLayout(2,1));
			p3.add(ticketl, "North");
			p3.add(list3);
			
			p4.setLayout(new GridLayout(2,1));
			p4.add(setsl, "North");
			p4.add(list4);
			
			p5.setLayout(new GridLayout(2,1));
			p5.add(moneyl, "North");
			p5.add(list5);
			

			// buttonp
			p6.setLayout(new GridLayout(1,5));
			p6.add(b1);
			p6.add(b2);
			p6.add(b3);
			p6.add(b4);
			p6.add(b5);
			buttonp.setLayout(new BorderLayout());
			buttonp.add(p6);
			
			// mainp
			mainp.setLayout(new GridLayout(1,5));
			mainp.add(p2);
			mainp.add(p3);
			mainp.add(p4);
			mainp.add(p5);
			
			warnp.setLayout(new BorderLayout());
			warnp.add(list6);
			
			
			// statusp
			statusp.setLayout(new BorderLayout());
			statusp.add(tf1, "North");
			statusp.add(mainp, "Center");
			statusp.add(warnp, "South");
		
			titlep.setLayout(new GridLayout(2, 1));
			titlep.add(p1, "North");
			titlep.add(buttonp);
			
		
			f.add(titlep, "North");
			f.add(statusp, "Center");
			f.setSize(1000, 800);
			f.setVisible(true);
		}
		
		public void addevent() {
			
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list2.removeAll();
					list3.removeAll();
					list4.removeAll();
					list5.removeAll();

					String strcash = tf1.getText();
			
				
					try {
						double cash = Double.parseDouble(strcash);
						
						if(cash < 0) {
							tf1.setText("0보다 큰 수를 입력하세요.");
						}else if(cash > 100000){
							tf1.setText("중독을 예방하고자 1회 최대 충전 금액을 10만원으로 제한하고 있습니다."); 
						}else {
							c.setCash(cash);
						
							if(c.getCash() < 1000) {
								c.buy();
								list2.add(String.format("%.2f", c.getCash()) + "원");
								list3.add(c.getTicket() + "장");
								tf1.setText("티켓 한 장은 1000원입니다.");
							} else {
								c.buy();
								list2.add(String.format("%.2f", c.getCash()) + "원");
								list3.add(c.getTicket() + "장");
								tf1.setText("충전 금액을 입력하세요.");
							}

						}
						
						
					} catch (Exception e1) {
						tf1.setText("숫자를 입력하세요.");
						}
					}

				}
			);
			
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						if(c.getTicket() == 0) {
							tf1.setText("티켓이 없습니다. 티켓을 구매하시려면 충전 금액을 입력한 다음 1을 누르세요.");
							list3.removeAll();
							list3.add(c.getTicket() + "장");
						} else {
							lot.draw(c);
							list3.removeAll();
							list3.add(c.getTicket() + "장");
							list4.add(lot.getLuckyset());
							list4.add(lot.getMyset());
							list4.add(lot.getResult());
							list4.add(lot.getRank() + "등");
							
						}
					}catch(Exception e2) {
						tf1.setText("티켓이 없습니다. 티켓을 구매하시려면 충전 금액을 입력한 다음 1을 누르세요.");
					}
				}
			});
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list5.removeAll();
					list5.add(lot.getMoney() + "원");
					
				}
			});
			
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Date today = new Date();
					SimpleDateFormat date = new SimpleDateFormat("YYYY년 MM월 dd일");
					String warn1 = "오늘은 " + date.format(today) + "입니다.";
					String warn2 = "3일 이내에 당첨금을 찾아가지 않으면 당첨금은 개똥이의 간식비로 사용되오니 당첨금 수령을 서두르지 않으시기를 권합니다.";
					
					list6.add(warn1);
					list6.add(warn2);
	
				}
			});
			
			b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list2.removeAll();
					list3.removeAll();
					list4.removeAll();
					list5.removeAll();
					list6.removeAll();
					tf1.setText("구매 금액을 입력하세요.");
					
					c = new Customer(0);
					lot = new Lotto(0, 0, 0, null, null);
					
				}
			});

			
			f.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
				
			});
		}
		
	
}
