package test;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class UpdateAnimal {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		
		AnimalVO cust = new AnimalVO("id12", "tiger", 11);
		try {
			dao.update(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
