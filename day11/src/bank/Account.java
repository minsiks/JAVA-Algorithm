package bank;

public class Account {
	// Attribute
	private String accNo;
	private double balance;
	
	//constructor
	public Account() {
	}

	
	public Account(String accNo) {
		this.accNo = accNo;
	}


	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}


	public String getAccNo() {
		return accNo;
	}


	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	public void deposit(double money) throws Exception {
		if(money < 1) {
			throw new MinusException("마이너스 입니다.");
		}
		this.balance += money;
	}
	
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 금액이 잔액 보다 많으면 안된다.
	public void withdraw(double money) throws MinusException, OverdrawnException {
		if(money < 1) {
			throw new MinusException("음수입니다.");
		}
		if(money > this.balance) {
			throw new OverdrawnException("잔액부족");
		}
		this.balance -= money;
	}
	
	
}
