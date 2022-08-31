package oracle;

public class UpdateTestApp {

	public static void main(String[] args) {
DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "james01");
		CustomerVO c2 = new CustomerVO("id02", "pwd01", "james01");
		CustomerVO c3 = new CustomerVO("id03", "pwd03", "±è¹Î½Ä");
		try {
			dao.insert(c1);
			System.out.println("Complite..i1");
			dao.insert(c2);
			System.out.println("Complite..i2");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
		try {
			dao.update(c3);
			System.out.println("Complite..U");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
