package test;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class SelectAnimal {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		AnimalVO ani = null;
		try {
			ani = dao.select("0001");
			System.out.println(ani);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
