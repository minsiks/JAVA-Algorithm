package first;

public class SwitchCase {

	public static void main(String[] args) {
		
		/*
		int rank = 0;
		char medalcolor = G;
		
		switch(medalcolor) { // 케이스에 문자도 사용가능  
		case 'G' : rank = 1;
				break;
		case 'S' : rank = 2;
				break;
		case 'B' : rank = 3;
				break;
		default : rank = 4;
		}
		System.out.println(rank);
		*/
		
		int month = 10;
		int day = 0;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 케이스 결과가 같을시 같이 사용 가능
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			break;
		}
		System.out.println(month + "월은" + day + "일 까지 있습니다.");
	}
}
