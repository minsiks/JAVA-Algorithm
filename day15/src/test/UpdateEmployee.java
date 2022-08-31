package test;

import dao.EmployeeDao;
import frame.Dao;
import vo.EmployeeVO;

public class UpdateEmployee {

	public static void main(String[] args) {
		Dao<Integer, EmployeeVO> dao = new EmployeeDao();
		EmployeeVO emp = new EmployeeVO(2, "Kim", "Cat");
		try {
			dao.update(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
