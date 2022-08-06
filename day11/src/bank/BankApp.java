package bank;

public class BankApp {

	public static void main(String[] args) {
		Account acc =new Account("1111", 10000);
		
		try {
			acc.deposit(-100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			acc.withdraw(-50);
		} catch (MinusException | OverdrawnException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(acc);
	}

}
