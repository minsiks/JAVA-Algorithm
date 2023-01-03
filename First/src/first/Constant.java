package first;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_NUM = 30;
		int num = 0;

		double id = 500000000000000000l;
		
		System.out.println(id);
		
		byte bNum = 10;
		num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		
		System.out.println(dNum);
		
		int iNum = 1000;
		byte bNum2 = (byte)iNum;
		
		System.out.println(bNum2);
	}

}
