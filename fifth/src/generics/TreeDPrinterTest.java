package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterail(new Powder());;
		Powder powder = printer.getMaterail();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterail(new Plastic());
		Plastic plastic = printerPlastic.getMaterail();
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
	}

}
