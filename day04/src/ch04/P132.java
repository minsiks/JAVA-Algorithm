package ch04;

public class P132 {

	public static void main(String[] args) {
		// i가 짝수 일때만 출력 하시오
        for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				System.out.println("For Loop:"+i);
			}
			
        } //end for
        
        System.out.println("-----------------------------------");
        
        int s = 1;   
        while (s <= 10) {
        	if (s%2 == 1) {
        		s++;
				continue;
			}
        	System.out.println("For while:"+s);
			s++;
		}
        
	}

}