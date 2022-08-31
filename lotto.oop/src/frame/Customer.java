package frame;

import java.text.DecimalFormat;

public class Customer extends Abstract {

private double cash;







public Customer() {
}

public Customer(double cash) {
	this.cash = cash;
}




public void buy() {	
	
	
	
	if(cash>=1000){
		setTicket(getTicket() + (int)cash/1000);
		cash -= ((int)(cash/1000)) * 1000; 
	} else {
		System.out.println("Ƽ���� ������ �� �����ϴ�.");
	}
}

public double getCash() {
	return cash;
}

public void setCash(double cash) {
	
	if(cash <= 0) {
		System.out.println("0���� ū ���� �Է��ϼ���.");
		return;
	}
	
	if(cash > 100000) {
		System.out.println("�ߵ��� �����ϰ��� 1ȸ �ִ� ���� �ݾ��� 10�������� �����ϰ� �ֽ��ϴ�.");
		return;
	}
	
	this.cash += cash;
}



	
	
}
