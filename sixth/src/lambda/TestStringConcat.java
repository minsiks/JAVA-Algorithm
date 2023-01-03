package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringContImpl sImpl = new StringContImpl();
		sImpl.makeString("gdgd", "dgdgdggd");
		
		StringConcat concat = (s1, s2)->System.out.println(s1 + " " + s2);
		concat.makeString("Asdfds", "sadfsaf");
		
		StringConcat concat2 = (s1, s2)->System.out.println(s1+s1+s1+""+s1+s1+""+s2+s2+s2+""+s2+s2);
		concat2.makeString("gd", "ta");
	}

}
