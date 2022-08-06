package oracle;

public class InsertTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01","pwd01","lee");
		CustomerVO c2 = new CustomerVO("id01","pwd01","lee");
		try {
			dao.insert(c1);
			System.out.println("completed 1 ..");
			dao.insert(c2);
			System.out.println("completed 2 ..");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
	}

}
