package car;

public abstract class Car {
	private String carname;
	private String company;
	private String color;
	private String status;
	public Car() {
	}
	public Car(String carname, String company, String color, String status) {
		this.carname = carname;
		this.company = company;
		this.color = color;
		this.status = status;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", company=" + company + ", color=" + color + ", status=" + status + "]";
	}
	public void go() {
		this.status = "Go";
		System.out.println("Go!!");
	}
	public void stop() {
		this.status =  "Stop";
		System.out.println("Stop");
	}
	public abstract void cfuel();
}
