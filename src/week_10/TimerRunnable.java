package week_10;

public class TimerRunnable implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		TimerRunnable t1 = new TimerRunnable();
		t1.run();
	}
}
