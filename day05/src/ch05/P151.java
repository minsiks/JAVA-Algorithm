package ch05;

public class P151 {

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		double sum = 0.0;
		// 배열에 홀수 번째 값들의 합과 평균을 구하시오
		for (int i = 0; i < ar.length; i++) {

			if(i%2<1) {
				continue;
			}
			sum += ar[i];
			System.out.println(ar[i]);
						
		}
		System.out.println(sum);
		System.out.println(sum/(ar.length/2));
	}

}
