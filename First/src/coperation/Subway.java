package coperation;

public class Subway implements Trans{
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void showInfo() {
		System.out.println("����ö" + lineNumber + "�� �°���" + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}

	@Override
	public void takeTrans(int money) {
		passengerCount++;
		this.money += money;
	}
}
