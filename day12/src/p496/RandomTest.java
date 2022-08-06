package p496;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		double d = Math.random(); // 0.0 <= x < 1.0
		System.out.println(d);
		
		int i1 = (int)(Math.random() * 6) + 1;
		System.out.println(i1);
		
		int i2 = (int)(Math.random() * 45) + 1;
		System.out.println(i2);
		
		Random r = new Random();
		int i3 = r.nextInt(45)+1;
		System.out.println(i3);
		
		double dd = (r.nextDouble() * 100000000000.0)+1;
		System.out.println(dd);
		System.out.printf("%.0f",dd);
	}

}
