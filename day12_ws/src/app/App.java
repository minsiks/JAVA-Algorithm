package app;

import java.util.List;
import java.util.Scanner;

import dao.AnimalDAO;
import frame.DAO;
import vo.AnimalVO;

public class App {

public static void main(String[] args) {
		
		DAO<String, AnimalVO> dao = new AnimalDAO();
		
		System.out.println("Start....");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(i,s,l,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("Input Animal Info ..");
				System.out.println("Input Animal ID ..");
				String id = sc.next();
				System.out.println("Input Animal Species ..");
				String species = sc.next();
				System.out.println("Input Animal Age ..");
				String age = sc.next();
				int a = Integer.parseInt(age);
				AnimalVO ani = new 	AnimalVO(id, species, a);
				try {
					dao.insert(ani);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}else if(cmd.equals("s")) {
				List<AnimalVO> list = null;
				try {
					list = dao.select();
					for (AnimalVO a : list) {
						System.out.println(a);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}else if(cmd.equals("l")) { // login
				System.out.println("Input id species..");
				String id = sc.next();
				String species = sc.next();
				AnimalVO a = null;
				try {
					a = dao.select(id);
					if(a.getSpecies().equals(species)) {
						System.out.println("Login Ok");
					}else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("Login Fail..");
				}
				
			}
		}
		
		sc.close();
		System.out.println("End....");

	}



}
