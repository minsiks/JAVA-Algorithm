package ch04;

public class P127 {

	public static void main(String[] args) {
		//주사위를 2개 던저서 나오는 값의 합이 8이 나오는 경우를 출력 하시오
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i+j != 8) {
					continue;
				}
				System.out.printf("1번:%d,2번:%d 합:%d\n",i,j,(i+j));
			}
			
		}

	}

}
