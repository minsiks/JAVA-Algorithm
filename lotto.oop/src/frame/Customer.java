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
		System.out.println("티켓을 구매할 수 없습니다.");
	}
}

public double getCash() {
	return cash;
}

public void setCash(double cash) {
	
	if(cash <= 0) {
		System.out.println("0보다 큰 수를 입력하세요.");
		return;
	}
	
	if(cash > 100000) {
		System.out.println("중독을 예방하고자 1회 최대 구매 금액을 10만원으로 제한하고 있습니다.");
		return;
	}
	
	this.cash += cash;
}



	
	
}
