package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {
		
		int ar [] = new int[10];		
		
		// for���� �̿��Ͽ� 1 ~ 9���� ������ ����� �迭�� �־��
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
			
		}
		//�迭 ������ ��� �Ͻÿ�\
		System.out.println(Arrays.toString(ar));
		
		//�հ� ����� ����Ͻÿ�
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		System.out.println(sum);
		System.out.println(sum/ar.length);
	}

}
