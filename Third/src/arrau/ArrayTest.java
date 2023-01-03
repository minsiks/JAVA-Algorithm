package arrau;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = -1;
		numbers[1] = 0;
		numbers[2] = 2;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		double[] studentIDs = new double[10];
		
		for (int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
	}

}
