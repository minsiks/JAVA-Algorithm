package inheritance;

public class ROverrideingTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(100010, "Lee");
//		int price = customerLee.calcPrice(10000);
//		
//		System.out.println("���� �ݾ��� " + price + "�̰�, " + customerLee.showCustomerInfo());
//		
//		VIPCustomer customerKim = new VIPCustomer(100010, "Kim",100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("���� �ݾ��� " + price + "�̰�, " + customerKim.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(100010, "who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�̰�, " + customerWho.showCustomerInfo());
		
	}

}
