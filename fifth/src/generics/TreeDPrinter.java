package generics;

public class TreeDPrinter<T extends Material>  {

	private T meterial;

	public T getMaterail() {
		return meterial;
	}

	public void setMaterail(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "TreeDPrinter [materail=" + meterial + "]";
	}
	
	public void printing() {
		meterial.doPrinting();
	}
	
}
