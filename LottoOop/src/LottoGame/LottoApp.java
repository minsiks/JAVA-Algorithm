package LottoGame;

public class LottoApp {

	public static void main(String[] args) {
		
		Lotto lot = new Lotto();
		lot.draw();
		System.out.println(lot.getRank() + "등");
		System.out.println("당첨금: " + lot.getMoney() + "원");
		
		System.out.println("-------");
		
		
		Lotto lot2 = new Lotto();
		lot2.draw();
		System.out.println(lot2.getRank() + "등");
		System.out.println("당첨금: " + lot2.getMoney() + "원");
	}

}
