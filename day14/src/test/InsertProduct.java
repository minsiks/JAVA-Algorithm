package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class InsertProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo("hat", 13000, 4.2);
		try {
			dao.insert(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
