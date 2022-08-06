package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class DeleteCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		try {
			dao.delete("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
