package week_2;

public class Car {
	private String color;
	private int speed = 0;
	static int count = 0;
	final static int MAX_SPEED = 200;
	final static int MIN_SPEED = 0;
	
	Car() {
		count++;
	}
	
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void upSpeed(int speed) {
		this.speed = speed + this.speed >= MAX_SPEED ? MAX_SPEED : speed + this.speed;
	}
	
	public void downSpeed(int speed) {
		this.speed = this.speed - speed <= MIN_SPEED ? MIN_SPEED : this.speed - speed;
	}
}