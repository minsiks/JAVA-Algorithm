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
				System.out.println("입금 금액 오류");
				return;
			}
			this.balance += money;
		}
		
		// 출금 금액이 1보다 작으면 안된다.
		// 출금 금액이 잔액 보다 많으면 안된다.
		public void withdraw(double money) {
			if(money < 1) {
				System.out.println("입금 금액 오류");
				return;
			}
			if(money > this.balance) {
				System.out.println("잔액보다 많은 금액을 인출할 수 없습니다.");
				return;
			}
			this.balance -= money;
		}
		
		
	

}
