package oracle;

import java.util.ArrayList;

public class SelectAllTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		ArrayList<CustomerVO> list = null;
		CustomerVO c1 = new CustomerVO("id1", "123", "±è¹Î½Ä");
		
		try {
			dao.insert(c1);
		} catch (DuplicatedIDException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			list = dao.select();
			System.out.println(list);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
