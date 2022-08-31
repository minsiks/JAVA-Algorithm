package multi;

public class Employee {
	private String id;
	private String name;
	private double salary;
	public Employee() {
	}
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double anysalary() {
		return this.salary *12 ;
	}
	
	public void getInsentive (double incen) {		
		System.out.println("¿Œºæ"+incen*0.5);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
