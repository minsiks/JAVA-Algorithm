package generics;

public class Plastic extends Material{
	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 자료를 추력합니다.");
	}
}
