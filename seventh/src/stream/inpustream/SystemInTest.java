package stream.inpustream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		int i =0;
		try {
			while((i = System.in.read()) !='\n') {
				System.out.print((char)i);
			};
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(i);
	}

}