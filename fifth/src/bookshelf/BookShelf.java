package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ลยน้ป๊ธฦ1");
		shelfQueue.enQueue("ลยน้ป๊ธฦ2");
		shelfQueue.enQueue("ลยน้ป๊ธฦ3");
		shelfQueue.enQueue("ลยน้ป๊ธฦ4");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
