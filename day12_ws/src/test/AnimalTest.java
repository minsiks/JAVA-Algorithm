package test;

import java.util.ArrayList;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class AnimalTest {

	public static void main(String[] args) {
		DAO<String, AnimalVO> dao = new AnimalDAO();
		
		
		
		try {
			AnimalVO a = new AnimalVO("0001", "dog", 14);
			AnimalVO b = new AnimalVO("0002", "dog", 1);
			AnimalVO c = new AnimalVO("0003", "cat", 12);
			dao.insert(a);
			dao.insert(b);
			dao.insert(c);
			ArrayList<AnimalVO> list = dao.select();
			for (AnimalVO ani : list) {
				System.out.println(ani);
			}
			dao.delete("0001");
			AnimalVO str = dao.select("0002");
			System.out.println("ºø∑∫"+str);
			
			dao.update(c);
			c.setId("0004");
			c.setAge(22);
			c.setSpecies("Monkey");
			ArrayList<AnimalVO> list2 = dao.select();
			for (AnimalVO ani : list2) {
				System.out.println("√÷¡æ"+ani);
			}
			dao.delete("0010");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
