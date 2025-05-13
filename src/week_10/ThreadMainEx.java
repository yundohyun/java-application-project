package week_10;

public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().threadId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		System.out.printf("ID: %d, Name: %s, Priority: %d, State: %s\n", id, name, priority, state);
	}
}
