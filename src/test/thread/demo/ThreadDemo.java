package test.thread.demo;

import test.thread.bean.Person;
import test.thread.bean.Student;

public class ThreadDemo {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		Person p2 = new Person();
//		p1.start();
//		p2.start();
		Student s1 = new Student("zhangsan");
		Student s2 = new Student("lisi");
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}

	public static void show() {
		while (true) {
			for (int i = 0; i < 100; i++) {

			}
			System.out.println("mainThread....");
		}
	}

}
