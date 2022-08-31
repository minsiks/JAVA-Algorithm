package test;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class SelectAnimal {

	public static void main(String[] args) {
		Dao<Integer, AnimalVo> dao = new AnimalDao();
		
		AnimalVo a = null;
		try {
			a = dao.select(4);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
