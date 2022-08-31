package test;

import java.util.List;

import dao.EmployeeDao;
import frame.Dao;
import vo.EmployeeVO;

public class SelectAllEmployee {

	public static void main(String[] args) {
		Dao<Integer, EmployeeVO> dao = new EmployeeDao();
		List<EmployeeVO> list = null;
		try {
			list = dao.select();
			for (EmployeeVO e : list) {
				System.out.println(e);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
