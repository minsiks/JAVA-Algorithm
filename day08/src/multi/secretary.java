package multi;

public class secretary extends Employee{
	private String boss;

	public secretary() {
	}

	public secretary(String id, String name, double salary, String boss) {
		super(id, name, salary);
		this.boss = boss;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	@Override
	public void getInsentive (double incen) {		
		System.out.println("¿Œºæ"+incen*0.6);
	}

	@Override
	public String toString() {
		return "secretary [boss=" + boss + ", toString()=" + super.toString() + "]";
	}


	

}
