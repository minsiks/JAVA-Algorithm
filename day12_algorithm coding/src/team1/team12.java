package team1;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.directory.SchemaViolationException;

public class team12 {

	public static void main(String[] args) {
		String arr[][] = {{"���","1000"},
				{"�ٳ���","2000"},
				{"��","3000"},
				{"����","3000"},
				{"����","2000"}};

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String budgit = sc.next();
		double b1 = Double.valueOf(budgit);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s \t",arr[i][j]);
				
			}
			System.out.println("");
			
		}
		System.out.println("������ �����ϼ��� ���:a,�ٳ���:b,��:p,����:g,����:s");
		String fruit = sc.next();
		if (fruit.equals("a")) {
//			String apple = arr[0][0];
			double many = b1/(Double.valueOf(arr[0][1]));
			double namuge = b1%(Double.valueOf(arr[0][1]));
			System.out.printf("���� : %s ����:%.0f ��  �ܵ� : %.0f��",arr[0][0],many,namuge);
//			System.out.printf("����:%s ����:%f�� �ܵ�:%f�� \n",arr[0][0],arr[0][1],arr[0][1]);
			
		}else if (fruit.equals("b")) {
			double many = b1/(Double.valueOf(arr[1][1]));
			double namuge = b1%(Double.valueOf(arr[1][1]));
			System.out.printf("���� : %s ����:%.0f ��  �ܵ� : %.0f��",arr[1][0],many,namuge);
			
		}else if (fruit.equals("p")) {
			double many = b1/(Double.valueOf(arr[2][1]));
			double namuge = b1%(Double.valueOf(arr[2][1]));
			System.out.printf("���� : %s ����:%.0f ��  �ܵ� : %.0f��",arr[2][0],many,namuge);
		}else if (fruit.equals("g")) {
			double many = b1/(Double.valueOf(arr[3][1]));
			double namuge = b1%(Double.valueOf(arr[3][1]));
			System.out.printf("���� : %s ����:%.0f ��  �ܵ� : %.0f��",arr[3][0],many,namuge);
		}else if (fruit.equals("s")) {
			double many = b1/(Double.valueOf(arr[4][1]));
			double namuge = b1%(Double.valueOf(arr[4][1]));
			System.out.printf("���� : %s ����:%.0f ��  �ܵ� : %.0f��",arr[4][0],many,namuge);
		}
		
		sc.close();
	}

}
