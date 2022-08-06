package ws;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		System.out.println("Start....");
		OracleDAO oracleDao = new OracleDAO();
		
		DAO dao = oracleDao;
		Search search = oracleDao;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(i,d,u,s,c,a,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("Input Customer info..");
				System.out.println("Input Customer id:");
				String id = sc.next();
				System.out.println("Input Customer spieces:");
				String species = sc.next();
				System.out.println("Input Customer age:");
				String sage = sc.next();
				int age = Integer.parseInt(sage);
				AnimalVO a = new AnimalVO(id, species, age);
				dao.create(a);
			}else if(cmd.equals("d")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
								
				dao.delete(id);
			}else if(cmd.equals("c")) {
				System.out.println("Input Customer spieces:");
				String species = sc.next();
				ArrayList<AnimalVO> list = search.search(species);
				for (AnimalVO a : list) {
					System.out.println(a);
				}
			}else if(cmd.equals("s")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				AnimalVO c = dao.read(id);
				System.out.println(c);
			}else if(cmd.equals("a")) {
				ArrayList<AnimalVO>list = dao.select();
				for (AnimalVO a : list) {
					System.out.println(a);
				}
			}else if(cmd.equals("u")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				System.out.println("Input Customer spieces:");
				String species = sc.next();
				System.out.println("Input Customer age:");
				String sage = sc.next();
				int age = Integer.parseInt(sage);
				
				AnimalVO a = new AnimalVO(id, species, age);
				dao.update(a);
			}
		}
		
		sc.close();
		System.out.println("End....");

	}

}
