package arrau;

public class BookArray {

	public static void main(String[] args) {
		
		book[] library = new book[5];
		
		library[0] = new book("�¹���1","������");
		library[1] = new book("�¹���2","������");
		library[2] = new book("�¹���3","������");
		library[3] = new book("�¹���4","������");
		library[4] = new book("�¹���5","������");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
