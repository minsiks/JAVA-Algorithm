package ws;

public class SelectTestApp {

	public static void main(String[] args) {
		DAO dao = new AnimalDAO();
		
		AnimalVO a1 = new AnimalVO("0001", "Lion", 25);
		AnimalVO a2 = new AnimalVO("0002", "Lion", 22);
		
		try {
			dao.insert(a1);
			System.out.println("completed 1 ..");
			dao.insert(a2);
			System.out.println("completed 2 ..");
			dao.select("0004");
			System.out.println("completed 3 ..");
		} catch (DuplicatedIDException | NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
