package vo;

public class AnimalVO {
	
	private String id;
	private String species;
	private int age;
	public AnimalVO() {
	}
	public AnimalVO(String id, String species, int age) {
		this.id = id;
		this.species = species;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AnimalVO [id=" + id + ", species=" + species + ", age=" + age + "]";
	}
	
}
