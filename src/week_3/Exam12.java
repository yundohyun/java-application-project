package week_3;

class iCat implements iAnimal {
	@Override
	public void eat() {
		System.out.println("생선을 먹는다");
	}
}

class iTiger extends Animal implements iAnimal {
	@Override
	void move() {
		System.out.println("4발로 이동한다");
	}
	
	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹는다");
	}
}

public class Exam12 {
	public static void main(String[] args) {
		iCat cat1 = new iCat();
		iTiger tiger1 = new iTiger();
		
		cat1.eat();
		
		tiger1.eat();
		tiger1.move();
	}
}
