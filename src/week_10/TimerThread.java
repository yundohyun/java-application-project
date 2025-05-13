package week_10;

public class TimerThread extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				System.out.println(i++);
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}

	public static void main(String[] args) {
		TimerThread thread = new TimerThread();
		thread.start();
	}
}
