package teamws;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ws02 {

	public static void main(String[] args) {
		//int�� [2][6] �������� ������ �迭�� �����.
		//6���� 3���� ������ ��÷
		int ar[][] = new int[2][6];
		Random r = new Random();
		
//		int win[]= new int[6]; // �ζ� ��÷ ��ȣ		
//		for (int i = 0; i < ar.length; i++) {	
//			win[i] = r.nextInt(45)+1; 
//			System.out.printf("%d \t",ar[i]);
//		} // �ζ� ��÷ ��ȣ
		
		for (int i = 0; i < ar.length; i++) {	
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t",ar[i][j]);
				ar[i][j] = r.nextInt(45)+1; //1~45 ������ �Է¹޾� �ִ´�.			
					
			
			}//���� �࿡ �ִ� �ζ� ��ȣ�� ��� �ߺ��� �ȵǳ�~?
			System.out.println("");
			
		}
//		System.out.println(Arrays.toString(ar));
		

	}

}
