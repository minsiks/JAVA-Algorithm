package test;

import java.util.ArrayList;

import dao.EmployeeDAO;
import frame.DAO;
import vo.EmployeeVO;

public class EmployeeTest {

	public static void main(String[] args) {
		DAO<Integer, EmployeeVO> dao = new EmployeeDAO();
		
		
		
		try {
			EmployeeVO a = new EmployeeVO(01,"lee","dog");
			EmployeeVO b = new EmployeeVO(02,"kim","cat");
			EmployeeVO c = new EmployeeVO(03,"hong","Monkey");
			dao.insert(a);
			dao.insert(b);
			dao.insert(c);
			ArrayList<EmployeeVO> list = dao.select();
			for (EmployeeVO emp : list) {
				System.out.println(emp);
			}
			dao.delete(01);
			EmployeeVO str = dao.select(02);
			System.out.println("ºø∑∫"+str);
			
			dao.update(c);
			c.setId(04);
			c.setName("kang");
			c.setCaringAnimal("Giraffe");
			ArrayList<EmployeeVO> list2 = dao.select();
			for (EmployeeVO emp : list2) {
				System.out.println("√÷¡æ"+emp);
			}
			dao.delete(0010);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
