package test;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class UpdateAnimal {

	public static void main(String[] args) {
		Dao<Integer, AnimalVo> dao = new AnimalDao();
		AnimalVo a = new AnimalVo(2, "Cat", 2);
		try {
			dao.update(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
