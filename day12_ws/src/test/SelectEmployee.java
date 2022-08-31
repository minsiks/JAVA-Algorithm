package test;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class SelectEmployee {

	public static void main(String[] args) {
		DAO<Integer,EmployeeVO> dao = new EmployeeDAO();
		EmployeeVO emp = null;
		try {
			emp = dao.select(73);
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
