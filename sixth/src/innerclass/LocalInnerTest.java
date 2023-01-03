package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable getRunnable(final int i) {

		final int localNum = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				
				outNum += 10;
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnabel = outer.getRunnable(20);
		runnabel.run();
		
		outer.getRunnable(50);
	}

}
