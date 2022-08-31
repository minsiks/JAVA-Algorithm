package vo;

public class EmployeeVO {
	private int id;
	private String name;
	private String caringAnimal;
	public EmployeeVO() {
	}
	public EmployeeVO(int id, String name, String caringAnimal) {
		this.id = id;
		this.name = name;
		this.caringAnimal = caringAnimal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaringAnimal() {
		return caringAnimal;
	}
	public void setCaringAnimal(String caringAnimal) {
		this.caringAnimal = caringAnimal;
	}
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", caringAnimal=" + caringAnimal + "]";
	}
	
}
