package Template;

import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {

		String title = "������ ����";
		String di = "��";
		
		char[] chArr = title.toCharArray();
		
		int something = title.indexOf(di);
		
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(title.charAt(i));
			
		}
	}

}
