package teamws;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class ws011 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(100);
		//������ ���� ����
//		System.out.println(i); //������ ����
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) 		{
		System.out.println("���� �Է��Ͻÿ�");
		String x = sc.next();
		int a =0;

		if(x.equals("����")) {
			System.out.println("�����ϰڽ��ϴ�");
			sc.close();
			break;
			}
		try {		
		    a = Integer.parseInt(x);
		    if (a <1 || a > 99) {
		    	System.out.println("���� �� �Է��Ͻÿ�");
				continue;
				
		    }
		    else if(i > a) {
		    	count++;
				System.out.println("�۾ƿ�");
				continue;
			}
		    else if(i < a) {
				count++;
				System.out.println("Ŀ��.");
				continue;
			}
		    else if(i == a) {
				count++;
				System.out.println("����");
				System.out.println(count+"������ ����");
				System.out.println("�����ϰڽ��ϴ�");
				sc.close();
				return;
			}
			
		}catch(Exception e) {
			System.out.println("���ڰ� �ƴմϴ�.");
			continue;
		}
		
		
		sc.close();
		}

	}

}