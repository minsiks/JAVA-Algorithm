package Strategy;

public class SumPrinter {

	void print(SumStrategy strategy, int N) {
		System.out.printf("the sum of 1 - %d : ", N);
		System.out.println(strategy.get(N));
	}
}
