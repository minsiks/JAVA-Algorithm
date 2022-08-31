package test;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class DeleteAnimal {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		
		
		try {
			dao.delete("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
