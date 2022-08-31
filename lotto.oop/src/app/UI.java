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
			b1 = new Button("1. �����ϱ�");
			b2 = new Button("2. Test your luck!");
			b3 = new Button("3. ��÷�� Ȯ���ϱ�");
			b4 = new Button("Warnings!");
			b5 = new Button("�ʱ�ȭ");
			
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
	
			titlel = new Label("�ζ� ��÷��(���� �ݾ��� �Է��� �� �Ʒ��� ��ư�� Ŭ���ϼ���.)");
			tl1 = new Label();
			tl3 = new Label();
			
			cashl = new Label("Cash");
			ticketl = new Label("Ticket");
			setsl = new Label("Draw");
			moneyl = new Label("Prize");
			
			tf1 = new TextField("���� �ݾ��� �Է��ϼ���.");
			
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
							tf1.setText("0���� ū ���� �Է��ϼ���.");
						}else if(cash > 100000){
							tf1.setText("�ߵ��� �����ϰ��� 1ȸ �ִ� ���� �ݾ��� 10�������� �����ϰ� �ֽ��ϴ�."); 
						}else {
							c.setCash(cash);
						
							if(c.getCash() < 1000) {
								c.buy();
								list2.add(String.format("%.2f", c.getCash()) + "��");
								list3.add(c.getTicket() + "��");
								tf1.setText("Ƽ�� �� ���� 1000���Դϴ�.");
							} else {
								c.buy();
								list2.add(String.format("%.2f", c.getCash()) + "��");
								list3.add(c.getTicket() + "��");
								tf1.setText("���� �ݾ��� �Է��ϼ���.");
							}

						}
						
						
					} catch (Exception e1) {
						tf1.setText("���ڸ� �Է��ϼ���.");
						}
					}

				}
			);
			
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						if(c.getTicket() == 0) {
							tf1.setText("Ƽ���� �����ϴ�. Ƽ���� �����Ͻ÷��� ���� �ݾ��� �Է��� ���� 1�� ��������.");
							list3.removeAll();
							list3.add(c.getTicket() + "��");
						} else {
							lot.draw(c);
							list3.removeAll();
							list3.add(c.getTicket() + "��");
							list4.add(lot.getLuckyset());
							list4.add(lot.getMyset());
							list4.add(lot.getResult());
							list4.add(lot.getRank() + "��");
							
						}
					}catch(Exception e2) {
						tf1.setText("Ƽ���� �����ϴ�. Ƽ���� �����Ͻ÷��� ���� �ݾ��� �Է��� ���� 1�� ��������.");
					}
				}
			});
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list5.removeAll();
					list5.add(lot.getMoney() + "��");
					
				}
			});
			
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Date today = new Date();
					SimpleDateFormat date = new SimpleDateFormat("YYYY�� MM�� dd��");
					String warn1 = "������ " + date.format(today) + "�Դϴ�.";
					String warn2 = "3�� �̳��� ��÷���� ã�ư��� ������ ��÷���� �������� ���ĺ�� ���ǿ��� ��÷�� ������ ���θ��� �����ñ⸦ ���մϴ�.";
					
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
					tf1.setText("���� �ݾ��� �Է��ϼ���.");
					
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
