package ch04;

import java.util.Scanner;

public class P109 {

	public static void main(String[] args) {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        System.out.println("input Number1 ..?");
        String n1 = sc.next();
        System.out.println("input Number2 ..?");
        String n2 = sc.next();
        
        double a = 75;
        double b = 7;
        double num = a/b;
        double round = Math.round(num*1000)/1000.0; 
        		
        System.out.println(round);
        
        String result = (round > 0)? "양수" : (round < 0)? "음수" : "0";
        System.out.println(result);
        
        String resulta = (round>=10)?"큰수": (round>=5)?"중간수":"작은수";
        System.out.println(resulta);

        
        // 입력 받은 숫자가 한자리 수가 아니면 종료
        if (n1.length()>1 || n2.length() >1 ) {
        	System.out.println("한자리 수가 아닙니다.");
        	sc.close();
        	return;
        }
                
        
        // 숫자만 입력 받는다.
        
        // "1" -> '1'
        char c1 = n1.charAt(0);
        char c2 = n2.charAt(0);
        if(!(c1 >= '1' && c1 <= '9' ) || !(c2 >= '1' && c2 <= '9') ) {
        	System.out.println("숫자가 아닙니다.");
        	sc.close();
        	return;
        }
        
        
        //System.out.println(n1.length());
        System.out.printf("입력한 숫자는 %s , %s 입니다.\n",n1,n2);
        
        sc.close();
        System.out.println("End");
	}

}
