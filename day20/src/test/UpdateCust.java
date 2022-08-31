package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class UpdateCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		CustVo cust = new CustVo("id12", "1212", "������");
		try {
			dao.update(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
