package week_3;

public class Exam09 {
	public static void main(String[] args) {
		Automobile auto = new Automobile("Red", 100, 4);
		Truck truck = new Truck("Blue", 50, 1000);
		
		System.out.println("Automobile color: " + auto.getColor());
		System.out.println("Automobile speed: " + auto.getSpeed());
		System.out.println("Automobile seat number: " + auto.getSeatNum());
		auto.upSpeed(200);
		System.out.println("Automobile speed: " + auto.getSpeed());
		
		System.out.println("Truck color: " + truck.getColor());
		System.out.println("Truck speed: " + truck.getSpeed());
		System.out.println("Truck weight: " + truck.getWeight());
		truck.upSpeed(200);
		System.out.println("Truck speed: " + truck.getSpeed());
	}
}
