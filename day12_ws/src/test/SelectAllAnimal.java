package test;

import java.util.List;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class SelectAllAnimal {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		List<AnimalVO> list = null;
		try {
			list = dao.select();
			for (AnimalVO animalVo : list) {
				System.out.println(animalVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
