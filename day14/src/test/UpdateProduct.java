package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class UpdateProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo(2,"bag", 3500,null,3.2);
		
		try {
			dao.update(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
