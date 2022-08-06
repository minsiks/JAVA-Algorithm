package oracle;

public class DeleteTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "james01");
		try {
			dao.insert(c1);
			System.out.println("Complite..i");
			dao.delete("id99");
			System.out.println("Complite..d1");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			String id1 = c1.getId();
			dao.delete(id1);
			System.out.println("Complite...d2");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
