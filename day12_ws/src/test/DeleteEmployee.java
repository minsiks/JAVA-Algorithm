package test;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class DeleteEmployee {

	public static void main(String[] args) {
		DAO<Integer,EmployeeVO> dao = new EmployeeDAO();
		
		try {
			dao.delete(88);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
