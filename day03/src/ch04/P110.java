package ch04;

import java.util.Scanner;

public class P110 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
        System.out.println("input Number1 ..?");
        String n1 = sc.next();
        System.out.println("input Number2 ..?");
        String n2 = sc.next();
        
        if(n1.length()< 2||n2.length()< 2||n1.length()>= 3||n2.length()>= 3) {
        	System.out.println("Bye");
        	sc.close();
        	return;
        }
        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        
        int result = a + b;
        int average = (a+b)/2;
        
        System.out.printf("ÇÕ°è %d \n",result);
        System.out.printf("Æò±Õ %d \n",average);
        
        sc.close();
        
	}

}
