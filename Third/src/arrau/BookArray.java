package arrau;

public class BookArray {

	public static void main(String[] args) {
		
		book[] library = new book[5];
		
		library[0] = new book("태백산맥1","조정래");
		library[1] = new book("태백산맥2","조정래");
		library[2] = new book("태백산맥3","조정래");
		library[3] = new book("태백산맥4","조정래");
		library[4] = new book("태백산맥5","조정래");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
