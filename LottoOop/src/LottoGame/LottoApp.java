package LottoGame;

public class LottoApp {

	public static void main(String[] args) {
		
		Lotto lot = new Lotto();
		lot.draw();
		System.out.println(lot.getRank() + "��");
		System.out.println("��÷��: " + lot.getMoney() + "��");
		
		System.out.println("-------");
		
		
		Lotto lot2 = new Lotto();
		lot2.draw();
		System.out.println(lot2.getRank() + "��");
		System.out.println("��÷��: " + lot2.getMoney() + "��");
	}

}
