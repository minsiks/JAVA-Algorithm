package lambda;

public class StringContImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

}