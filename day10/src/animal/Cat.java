package animal;

public class Cat extends Animal {

	private String eyecolor;
	
	public Cat() {
	}

	public Cat(String name, int age, String sex, String habitat, String status) {
		super(name, age, sex, habitat, status);
	}

	public Cat(String name, int age, String sex, String habitat, String status, String eyecolor) {
		super(name, age, sex, habitat, status);
		this.eyecolor = eyecolor;
	}

	public String getEyecolor() {
		return eyecolor;
	}

	public void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}

	@Override
	public String toString() {
		return "Cat [eyecolor=" + eyecolor + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void cry() {
		System.out.println("meow-");
	}

}
