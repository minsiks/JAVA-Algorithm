package p344;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start....");
		OracleDAO dao = new OracleDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(i,d,s,a,q) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("Input Customer info..");
				System.out.println("Input Customer id:");
				String id = sc.next();
				System.out.println("Input Customer pwd:");
				String pwd = sc.next();
				System.out.println("Input Customer name:");
				String name = sc.next();
				
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.insert(c);
			}else if(cmd.equals("d")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
								
				dao.delete(id);
			}else if(cmd.equals("s")) {
				System.out.println("Input Customer id:");
				String id = sc.next();
				CustomerVO c = dao.select(id);
				System.out.println(c);
			}else if(cmd.equals("a")) {
				ArrayList<CustomerVO>list = dao.select();
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}
		}
		
		sc.close();
		System.out.println("End....");
		
	}

}
