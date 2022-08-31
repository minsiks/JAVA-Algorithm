package ch06;

public class Car {
	// Attribute
	String name;
	String color;
	int size;
	int fsize;
	int cfsize;
	
	// Constructor - »ý¼ºÀÚ
	public Car() {
		
	}
	
	public Car(String name, String color, int size, int fsize, int cfsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
		this.cfsize = cfsize;
	}

	// Operation
	public void go() {
		System.out.println("Go !");
	}

	public void stop() {
		System.out.println("Stop !");
	}
	public void addFuels(int f) {
		cfsize += f;
	}
	@Override
	public String toString() {
		return "Car [name=" + this.name + ", color=" + this.color + ", size=" + this.size + ", fsize=" + this.fsize + ", cfsize=" + this.cfsize
				+ "]";
	}
	
}
