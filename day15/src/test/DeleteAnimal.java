package test;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class DeleteAnimal {

	public static void main(String[] args) {
		Dao<Integer, AnimalVo> dao = new AnimalDao();
		
		try {
			dao.delete(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
