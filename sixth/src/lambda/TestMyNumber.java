package lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		MyNumber maxNum = (x, y) ->(x>=y)?x:y;
		
		int max = maxNum.getMaxNumber(20, 51);
		System.out.println(max);
	}

}
