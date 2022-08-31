package animal;

public class App {

	public static void main(String[] args) {
		Animal a[] = new Animal [5];
		
		a[0] = new Cat("james", 4, "M", "Seoul", "getup" , "blue");
		a[1] = new Cat("tomi",15,"F","Paris","sleep","black");
		a[2] = new Monkey("jimi", 7, "M","India", "healthy", 120);
		a[3] = new Monkey("Tayror", 25, "F","Malaysia", "sick", 150);
		a[4] = new Lion("Brown",11, "F", "Gana", "getup", "chicken");
	
		
		for (Animal animal : a) {
			System.out.println(animal);
			animal.cry();
		}
	}

}
