package week_2;

public class Exam07 {
	public static void main(String[] args) {
		Car car1 = new Car("red", 100);
		Car car2 = new Car("blue", 120);
		Car car3 = new Car("green", 150);
		
		car1.upSpeed(15);
		System.out.println(car1.getSpeed());
		car2.downSpeed(10);
		System.out.println(car2.getSpeed());
		car3.upSpeed(60);
		System.out.println(car3.getSpeed());
		
		System.out.println(Car.MIN_SPEED + ", " + Car.MAX_SPEED);
		
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 5));
	}
}
