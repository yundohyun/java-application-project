package week_3;

public class Automobile extends Car {
	private int seatNum;
	
	Automobile(String color, int speed, int seatNum) {
		super(color, speed);
		this.seatNum = seatNum;
	}
	
	int getSeatNum() {
		return seatNum;
	}
	
	public void upSpeed(int value) {
		speed = value + speed >= 300 ? 300 : value + speed;
	}
}
