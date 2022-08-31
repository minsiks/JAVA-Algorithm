package animal;

public class Monkey extends Animal {
	
	private int iq;

	public Monkey() {
	}

	public Monkey(String name, int age, String sex, String habitat, String status) {
		super(name, age, sex, habitat, status);
	}

	public Monkey(String name, int age, String sex, String habitat, String status, int iq) {
		super(name, age, sex, habitat, status);
		this.iq = iq;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "Monkey [iq=" + iq + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void cry() {
		System.out.println("oo-oo-ah-ah");
	}

}
