package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class DeleteItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		
		try {
			dao.delete(88);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
