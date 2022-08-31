package car;

public class Gasoline extends Car {

	private double gbattery;
	private double maxgsize;
	private double gsize;
	
	public Gasoline() {
	}

	public Gasoline(String carname, String company, String color, String status) {
		super(carname, company, color, status);
	}
	

	public Gasoline(String carname, String company, String color, String status, double gbattery, double maxgsize,
			double gsize) {
		super(carname, company, color, status);
		this.gbattery = gbattery;
		this.maxgsize = maxgsize;
		this.gsize = gsize;
	}

	public double getGbattery() {
		return gbattery;
	}

	public void setGbattery(double gbattery) {
		this.gbattery = gbattery;
	}

	public double getMaxgsize() {
		return maxgsize;
	}

	public void setMaxgsize(double maxgsize) {
		this.maxgsize = maxgsize;
	}

	public double getGsize() {
		return gsize;
	}

	public void setGsize(double gsize) {
		this.gsize = gsize;
	}

	@Override
	public String toString() {
		return "Gasoline [gbattery=" + gbattery + ", maxgsize=" + maxgsize + ", gsize=" + gsize + ", toString()="
				+ super.toString() + "]";
	}

	public void addg(double gas) {
		this.gbattery += gas;		
	}
	@Override
	public void cfuel() {
		System.out.printf("현재연료 가스: %.0f\n",this.gbattery );
	}

}
