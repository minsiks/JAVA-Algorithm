package p496;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		double num = 1234567878685.789;
		DecimalFormat df = new DecimalFormat("\u00A4 #,### %");
		
		String str = df.format(num);
		System.out.println(str);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:S E a");
		String str2 = sdf.format(new Date());
		System.out.println(str2);
	}

}
