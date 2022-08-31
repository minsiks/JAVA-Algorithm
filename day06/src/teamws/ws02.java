package teamws;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ws02 {

	public static void main(String[] args) {
		//int형 [2][6] 사이즈의 이차원 배열을 만든다.
		//6개중 3개가 맞으면 당첨
		int ar[][] = new int[2][6];
		Random r = new Random();
		
//		int win[]= new int[6]; // 로또 당첨 번호		
//		for (int i = 0; i < ar.length; i++) {	
//			win[i] = r.nextInt(45)+1; 
//			System.out.printf("%d \t",ar[i]);
//		} // 로또 당첨 번호
		
		for (int i = 0; i < ar.length; i++) {	
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t",ar[i][j]);
				ar[i][j] = r.nextInt(45)+1; //1~45 난수를 입력받아 넣는다.			
					
			
			}//같은 행에 있는 로또 번호는 어떻게 중복이 안되나~?
			System.out.println("");
			
		}
//		System.out.println(Arrays.toString(ar));
		

	}

}
