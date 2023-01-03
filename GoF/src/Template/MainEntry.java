package Template;

import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {

		String title = "디자인 패턴";
		String di = "디";
		
		char[] chArr = title.toCharArray();
		
		int something = title.indexOf(di);
		
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(title.charAt(i));
			
		}
	}

}
