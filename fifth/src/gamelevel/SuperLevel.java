package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("���󻡶��");
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
		System.out.println("��޷����Դϴ�. �����Դϴ�.");
	}


}
