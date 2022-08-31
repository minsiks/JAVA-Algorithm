package test;

import java.util.List;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class SelectAllEmployee {

	public static void main(String[] args) {
		DAO<Integer,EmployeeVO> dao = new EmployeeDAO();
		List<EmployeeVO> list = null;
		try {
			list = dao.select();
			for (EmployeeVO employeeVO : list) {
				System.out.println(employeeVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
