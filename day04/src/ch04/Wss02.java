package ch04;

import java.util.Random;
import java.util.Scanner;

public class Wss02 {

	public static void main(String[] args) {
		//1. 10~99������ ���ڸ� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("input number?");
		String snum = sc.next();
		
		//����: ���ڿ��� �ϸ� �����ȿ� ���ڿ��� �Ѵ�.
		
		int num = Integer.parseInt(snum);
		
		//2. 2���� �Է� ���� ���ڱ������� ������ �߻� ��Ų��.		
		Random r = new Random();
		int rnum = r.nextInt(num-1)+2;
		
		
		//3. 1���� ���������� ���� ���Ѵ�.
		
		//��, ¦���� ���� �հ� ����� ���Ѵ�.
		double sum = 0.0;
		int count = 0;
		for (int i = 2; i < rnum; i+=2) {
				sum += i;
				count++;
		}
		
		
		
		System.out.println(sum);
		System.out.println(sum/count);
		sc.close();
	}

}
