package ws;

public class InsertTestApp {

	public static void main(String[] args) {
		DAO dao = new AnimalDAO();
		
		AnimalVO a1 = new AnimalVO("0001", "Lion", 25);
		AnimalVO a2 = new AnimalVO("0002", "Lion", 22);
		AnimalVO a3 = new AnimalVO("0002", "dog", 2);
		
		try {
			dao.insert(a1);
			System.out.println("completed 1 ..");
			dao.insert(a2);
			System.out.println("completed 2 ..");
			dao.insert(a3);
			System.out.println("completed 3 ..");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
	}

}
