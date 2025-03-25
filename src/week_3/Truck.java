package week_3;

public class Truck extends Car {
	int weight;
	
	Truck(String color, int speed, int weight) {
		super(color, speed);
		this.weight = weight;
	}
	
	int getWeight() {
		return weight;
	}
}
