package test;

import dao.EmployeeDao;
import frame.Dao;
import vo.EmployeeVO;

public class SelectEmployee {

	public static void main(String[] args) {
		Dao<Integer, EmployeeVO> dao = new EmployeeDao();
		
		EmployeeVO emp = null;
		try {
			emp = dao.select(4);
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
