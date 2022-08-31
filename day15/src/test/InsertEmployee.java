package test;

import dao.EmployeeDao;
import frame.Dao;
import vo.EmployeeVO;

public class InsertEmployee {

	public static void main(String[] args) {
		Dao<Integer, EmployeeVO> dao = new EmployeeDao();
		
		EmployeeVO a = new EmployeeVO(4, "lee", "lion");
		try {
			dao.insert(a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
