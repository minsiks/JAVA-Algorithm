package car;

public class App {

	public static void main(String[] args) {
		Car c[] = new Car[2];
		c[0] = new hybrid("sonata", "hyundai", "black", "stop", 0, 0, "Gasoline", 100, 100, 0, 0);
		c[1] = new Gasoline("A5", "audi", "white", "stop", 0, 200, 0);
		
		
		for (Car car : c) {
			car.go();
			
			if(car instanceof hybrid) {
				hybrid hybrid = (hybrid)car;
				hybrid.adde(50);
				hybrid.addg(150);
				hybrid.switchmode();
				hybrid.switchmode();
				System.out.println("sonata ���簡�� : "+ hybrid.getGbattery());
				System.out.println("sonata �������� : "+ hybrid.getEbattery());
				System.out.println("sonata ������� : " + hybrid.getMod());
				hybrid.cfuel();
				System.out.println("sonata ������� : " + car.getStatus());
			}
			if(car instanceof Gasoline) {
				Gasoline gasoline = (Gasoline)car;
				gasoline.addg(150);
				System.out.println("A5 ���簡�� : "+ gasoline.getGbattery());
				gasoline.cfuel();
				System.out.println("A5 ������� : " + car.getStatus());
			}
			System.out.println(car);
		}
	
	}
	

}
