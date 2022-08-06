package test;

import java.util.List;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class SelectAllAnimal {

	public static void main(String[] args) {
		Dao<Integer, AnimalVo> dao = new AnimalDao();
		List<AnimalVo> list = null;
		try {
			list = dao.select();
			for (AnimalVo a : list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
