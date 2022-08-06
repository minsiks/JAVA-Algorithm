package ch03;

public class ws0405 {

	public static void main(String[] args) {
		double a = 5;
		double b = 7;
		double result = (Math.sqrt((Math.pow(a, 2)+Math.pow(b,2))));
		
		double result1 = (Math.round(result*1000)/1000.0);
		
		System.out.println(result);
		System.out.println(result1);
		
		
	}

}
