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
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		shelfQueue.enQueue("�¹���4");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
