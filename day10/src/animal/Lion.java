package animal;

public class Lion extends Animal {

	private String prey;
	public Lion() {
	}

	public Lion(String name, int age, String sex, String habitat, String status) {
		super(name, age, sex, habitat, status);
	}
	
	public Lion(String name, int age, String sex, String habitat, String status, String prey) {
		super(name, age, sex, habitat, status);
		this.prey = prey;
	}
	public String getPrey() {
		return prey;
	}

	public void setPrey(String prey) {
		this.prey = prey;
	}
	
	@Override
	public String toString() {
		return "Lion [prey=" + prey + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void cry() {
		System.out.println("roar-!!!!!");
	}

}
