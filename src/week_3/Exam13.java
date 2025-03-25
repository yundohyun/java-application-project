package week_3;

interface ClistLis {
	void print();
}

public class Exam13 {
	public static void main(String[] args) {
		ClistLis cl = new ClistLis() {
			@Override
			public void print() {
				System.out.println("Click");
			}
		};
		cl.print();
	}
}
