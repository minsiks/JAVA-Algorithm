package ws;

public class UpdateTestApp {

	public static void main(String[] args) {
		DAO dao = new AnimalDAO();
		
		AnimalVO a1 = new AnimalVO("0001", "Lion", 25);
		AnimalVO a2 = new AnimalVO("0002", "Lion", 22);
		AnimalVO a3 = new AnimalVO("0005", "Lion", 22);
		
		try {
			dao.insert(a1);
			System.out.println("completed 1 ..");
			dao.insert(a2);
			System.out.println("completed 2 ..");
			dao.update(a2);
			a2.setId("0003");
			a2.setSpecies("dog");
			System.out.println("completed 3 ..");
			dao.update(a3);
			
		} catch (DuplicatedIDException | NotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a1);
		System.out.println(a2);
	}

}
