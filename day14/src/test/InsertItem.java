package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class InsertItem {

	public static void main(String[] args) {
		Dao<Integer,ItemVo> dao = new ItemDao();
		
		ItemVo item = new ItemVo(88, "Ä©¼Ö", 4500);
		try {
			dao.insert(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
