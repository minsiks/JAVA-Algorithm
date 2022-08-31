package multi;

public class MultiApp {

	public static void main(String[] args) {
		Employee e[] = new Employee[8];
		e[0] = new Employee("1000","kim" ,230);
		e[1] = new Employee("1001","lee" ,210);
		e[2] = new secretary("1002", "hong",240,"choi");
		e[3] = new secretary("1003", "park",225,"bae");
		e[4] = new sales("1004", "hwang", 290, "incheon", 2000, 1100);
		e[5] = new sales("1005", "seo", 350, "seoul", 2000, 2500);
		e[6] = new Manager("1006","kang" , 400, 20);
		e[7] = new Manager("1006", "jang", 370, 10);
		
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			System.out.println("연봉:"+e[i].anysalary());
			Employee f = e[i];
			f.getInsentive(1000);
			if(e[i]instanceof Manager) {
				Manager m = (Manager) e[i];
				
				System.out.println("관리자 보너스:"+m.getBonus());
			}
			
		}
//		for (int i = 0; i < e.length; i++) {
//			if(e[i]instanceof Manager) {
//				Manager m = (Manager) e[i];
//				System.out.println("관리자 보너스:"+m.getBonus());
//			}
//		}
		
		
	}
	

}
