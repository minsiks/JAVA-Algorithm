package car;

public class Car {
	private String name;
	private double fszie;
	private double cfsize;
	private String status;
	private double fe;
	
	public Car() {
	}

	public Car(String name, double fszie, double fe) {
		this.name = name;
		this.fszie = fszie;
		this.fe = fe;
		this.status = "STOP";
	}

	public Car(String name, double fszie, double cszie, String status, double fe) {
		this.name = name;
		this.fszie = fszie;
		this.cfsize = cfsize;
		this.status = status;
		this.fe = fe;
	}

	public double getCszie() {
		return cfsize;
	}

	public void setCszie(double cszie) {
		this.cfsize = cszie;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getFe() {
		return fe;
	}

	public void setFe(double fe) {
		this.fe = fe;
	}

	public String getName() {
		return name;
	}

	public double getFszie() {
		return fszie;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", fszie=" + fszie + ", cfsize=" + cfsize + ", status=" + status + ", fe=" + fe
				+ "]";
	}
	
	public void go(double km) {
		if(this.cfsize == 0 && this.cfsize < 0) {
			System.out.println("기름이 없습니다.");
			return;
		}
		System.out.println(this.name+": GO");
		this.status = "GO";
		this.cfsize -= (km/this.fe);
	}
	public void stop() {
		System.out.println(this.name+": STOP");
		this.status = "STOP";
	}
	
	
}
