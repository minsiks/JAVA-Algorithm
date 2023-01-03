package interfaceex;

public class MyClass implements MyInterface{

	@Override
	public void X() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void mymethod() {
		System.out.println("myMethod()");
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		xClass.X();
	}
}
