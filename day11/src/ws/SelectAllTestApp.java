package ws;

import java.util.ArrayList;

public class SelectAllTestApp {

	public static void main(String[] args) {
		DAO dao = new AnimalDAO();
		ArrayList<AnimalVO> list = null;
		
//		AnimalVO a1 = new AnimalVO("0001", "Lion", 25);
//		
//		
//		try {
//			dao.insert(a1);
//		} catch (DuplicatedIDException e1) {
//			System.out.println(e1.getMessage());
//		}
//		
		try {
			list = dao.select();
			System.out.println(list);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
