package test;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class UpdateEmployee {

	public static void main(String[] args) {
		DAO<Integer,EmployeeVO> dao = new EmployeeDAO();
		EmployeeVO item = new EmployeeVO(73, "lee", "tiger");
		
		try {
			dao.update(item);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
