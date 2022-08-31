package ch05;

public class P148 {

	public static void main(String[] args) {
		String str = "abcde";
		
		int c = str.indexOf("c");
		System.out.println(c);
		
		String str2 = str.substring(0,2);
		System.out.println(str2);
		
		String mail = "jmlee@tonesol.com";
		// id와 domain을 출력하시오
		
		int i = mail.indexOf("@");
		int d = mail.indexOf(".com");
		String id = mail.substring(0,i);
		String domain = mail.substring(i+1,d);
		
		System.out.printf("%s\n%s\n",id,domain);
		
		String ss = "  abc  ";
		
		System.out.println(ss.trim());
		
	}

}
