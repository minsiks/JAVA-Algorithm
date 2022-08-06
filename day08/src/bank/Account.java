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
	
	public void deposit(double money) {
		if(money < 1) {
			System.out.println("�Ա� �ݾ� ����");
			return;
		}
		this.balance += money;
	}
	
	// ��� �ݾ��� 1���� ������ �ȵȴ�.
	// ��� �ݾ��� �ܾ� ���� ������ �ȵȴ�.
	public void withdraw(double money) {
		if(money < 1) {
			System.out.println("�Ա� �ݾ� ����");
			return;
		}
		if(money > this.balance) {
			System.out.println("�ܾ׺��� ���� �ݾ��� ������ �� �����ϴ�.");
			return;
		}
		this.balance -= money;
	}
	
	
}
