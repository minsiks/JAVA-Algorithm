package Backjoon0807;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
		
    	Scanner in = new Scanner(System.in);
    	
    	int X = in.nextInt();
    	int N = in.nextInt();
    	int r = 0;
    	in.nextLine();
    	int a = 0;
    	int b = 0;
    	
    	for (int i = 0; i < N; i++) {
    		String ab = in.nextLine();
        	String[] splited = ab.split("\\s");
        	a = Integer.parseInt(splited[0]);
        	b = Integer.parseInt(splited[1]);
        	r += a*b;
		}
    	if (r==X) {
			System.out.println("YES");
		}else if (r!=X) {
			System.out.println("NO");
		}
    	in.close();
    }
}


