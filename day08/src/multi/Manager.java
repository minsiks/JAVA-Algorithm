package multi;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = anysalary()*(bonus/100);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = anysalary()*(bonus/100);
	}
	
	
	@Override
	public void getInsentive (double incen) {		
		System.out.println("¿Œºæ"+incen);
	}
	
	@Override
	public double anysalary() {
		double sum = 0.0;
		sum = super.anysalary()+this.bonus;
		return sum;
		}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	
	
}
