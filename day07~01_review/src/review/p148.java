package review;

public class p148 {

	public static void main(String[] args) {
		String strVar1 = "��ν�";
		String strVar2 = "��ν�";
		
		if(strVar1 == strVar2){
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}

		String strVar3 = new String ("��ν�");
		String strVar4 = new String ("��ν�");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
