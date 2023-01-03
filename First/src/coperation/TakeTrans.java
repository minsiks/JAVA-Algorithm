package coperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("james", 5000);
		Student tomas = new Student("tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway sub20 = new Subway(20);
		
		james.takeSubway(sub20);
		james.showInfo();
		sub20.showInfo();
		
		tomas.takeBus(bus100);
		tomas.showInfo();
		bus100.showInfo();
		
	}

}
