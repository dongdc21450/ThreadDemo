package test.thread.bean;

public class Student implements Runnable {
	private String name;

	public String getName() {
		return name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 100; i++) {

			}
			System.out.println(Thread.currentThread().getName() + this.name + "subThread....");
		}
	}
}
