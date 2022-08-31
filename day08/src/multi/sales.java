package multi;

public class sales extends Employee {
	private String region;
	private double goal;
	private double result;
	public sales() {
	}

	public sales(String id, String name, double salary, String region, double goal, double result) {
		super(id, name, salary);
		this.region = region;
		this.goal = goal;
		this.result = result;
	}

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getGoal() {
		return goal;
	}
	public void setGoal(double goal) {
		this.goal = goal;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public void getInsentive (double incen) {		
		double per = 0.0;
		per = (result/goal*100);
		if (per>=80) {
			System.out.println("인센"+incen*0.8);
		}else if (per>=70) {
			System.out.println("인센"+incen*0.7);
		}else {
			System.out.println("인센"+incen*0.6);
			}
	}

	@Override
	public String toString() {
		return "sales [region=" + region + ", goal=" + goal + ", result=" + result + ", toString()=" + super.toString()
				+ "]";
	}
	



	
}
