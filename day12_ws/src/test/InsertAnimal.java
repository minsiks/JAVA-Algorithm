package test;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class InsertAnimal {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		
		AnimalVO cust = new AnimalVO("id77", "lion", 55);
		try {
			dao.insert(cust);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
