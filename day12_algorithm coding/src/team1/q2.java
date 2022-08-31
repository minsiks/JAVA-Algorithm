package team1;

public class q2 {

	public static void main(String[] args) {
		String arr[][] = { {"사과", "1000"}, 
				{"바나나", "2000"}, 
				{"배", "3000"}, 
				{"포도", "3000"}, 
				{"딸기", "2000"} };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s \t",arr[i][j]);
			}System.out.println("");
		}
	}

}
