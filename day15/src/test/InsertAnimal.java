package test;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class InsertAnimal {

	public static void main(String[] args) {
		Dao<Integer, AnimalVo> dao = new AnimalDao();
		
		AnimalVo a = new AnimalVo(4, "lion", 5);
		try {
			dao.insert(a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
