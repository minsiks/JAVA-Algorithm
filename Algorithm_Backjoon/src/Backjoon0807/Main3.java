package Backjoon0807;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	int r = 0;
    	for (int i = 0; i <= n; i++) {
			r += i;
		}
    	System.out.println(r);
    	in.close();
    }
}


