package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 92;
		int num2 = 1;
		
		CompleteCalc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		
		int sum = Calc.total(arr);
		System.out.println(sum);
		
		
	}

}
