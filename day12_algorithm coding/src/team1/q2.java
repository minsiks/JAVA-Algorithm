package team1;

public class q2 {

	public static void main(String[] args) {
		String arr[][] = { {"���", "1000"}, 
				{"�ٳ���", "2000"}, 
				{"��", "3000"}, 
				{"����", "3000"}, 
				{"����", "2000"} };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s \t",arr[i][j]);
			}System.out.println("");
		}
	}

}
