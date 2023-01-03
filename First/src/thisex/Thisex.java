package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class Thisex {

	
	public static void main(String[] args) {
		Birthday b = new Birthday();
		
		b.printThis();
	}

}
