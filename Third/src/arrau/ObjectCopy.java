package arrau;

public class ObjectCopy {

	public static void main(String[] args) {

		book[] bookArray1 = new book[3];
		book[] bookArray2 = new book[3];
		
		bookArray1[0] = new book("태백산맥1", "조정래");
		bookArray1[1] = new book("태백산맥2", "조정래");
		bookArray1[2] = new book("태백산맥3", "조정래");
		
		bookArray2[0] = new book();
		bookArray2[1] = new book();
		bookArray2[2] = new book();
		
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());			
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("=============");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"java","Android","C"};
		
		for (String string : strArr) {
			System.out.println(string);
		}
		
	}

}
