package Bank;

	public class Bank {
		// Attribute
		private String accNo;
		private String name;
		private double balance;
		
		//constructor
		public Bank() {
		}

		public Bank(String accNo, String name, double balance) {
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}
		


		public double getBalance() {
			return balance;
		}


		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
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
