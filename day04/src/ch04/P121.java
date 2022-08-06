package ch04;

import java.util.Iterator;
import java.util.Random;

public class P121 {

	public static void main(String[] args) {
        // Random을 통해 2~99까지의 난수를 발생 시킨다.
		Random r = new Random();
		int n = r.nextInt(98)+2;
		System.out.println(n);
		// 1 부터 난수까지의 합과 평균을 출력 한다. for
		double sum = 0.0;
		int count =0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			count++;
		}
		System.out.println(sum);
		System.out.println(sum/count);
		System.out.println(count);
	}

}
