package animal;

public abstract class Animal {
	private String name;
	private int age;
	private String sex;
	private String habitat;
	private String status;
	public Animal() {
	}
	public Animal(String name, int age, String sex, String habitat, String status) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.habitat = habitat;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sex=" + sex + ", habitat=" + habitat + ", status=" + status
				+ "]";
	}
	
	public void sleep() {
		this.status="sleep";
		System.out.println("zzzzz");
	}
	public void getup() {
		this.status="getup";
		System.out.println("し_し");
	}
	public void sick() {
		this.status="sick";
		System.out.println("ぬ_ぬ");
	}
	public void healthy() {
		this.status="healthy";
		System.out.println("^_^");
	}
	public abstract void cry();
	
	
}
