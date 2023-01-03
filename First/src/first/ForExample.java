package first;

public class ForExample {

	public static void main(String[] args) {
		
		/*
		int num;
		int sum = 0;
		
		for(num = 1; num <= 10; num++) {
			
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num); */
		
		for(int i=1; i<=9; i++) {
			System.out.println(i+"´Ü ½ÃÀÛ");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * " + j +" = " + (i*j));
			}
		}
	}
}
