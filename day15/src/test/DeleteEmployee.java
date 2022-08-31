package test;

import dao.EmployeeDao;
import frame.Dao;
import vo.EmployeeVO;

public class DeleteEmployee {

	public static void main(String[] args) {
		Dao<Integer, EmployeeVO> dao = new EmployeeDao();
		
		try {
			dao.delete(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
