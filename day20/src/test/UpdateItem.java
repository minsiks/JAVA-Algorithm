package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class UpdateItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		ItemVo item = new ItemVo(73, "�ڽ�", 350);
		
		try {
			dao.update(item);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
