package test.thread.bean;

public class Person extends Thread {

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 100; i++) {

			}
			System.out.println(Thread.currentThread().getName() + "subThread....");
		}
	}

}
