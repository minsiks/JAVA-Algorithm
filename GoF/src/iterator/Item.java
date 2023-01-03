package iterator;

public class Item {

	public String name;
	private int cost;
	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", cost=" + cost + "]";
	}
	
	
}
