package test;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class InsertEmployee {

	public static void main(String[] args) {
		DAO<Integer,EmployeeVO> dao = new EmployeeDAO();
		
		EmployeeVO item = new EmployeeVO(88, "lee", "lion");
		try {
			dao.insert(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
