package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String > shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getshelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
