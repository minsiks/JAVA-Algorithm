package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("빨라빨라요");
	}

	@Override
	public void jump() {
		System.out.println("jump OOOOO");
	}

	@Override
	public void turn() {
		System.out.println("turnOOOOOOX");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급레벨입니다. 레벨입니다.");
	}


}
