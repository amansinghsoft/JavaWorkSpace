package com.first.project;

class ThreadExample1 extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("I am Aman.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class ThreadExample2 extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("I am a student.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		
		ThreadExample1 obj1 = new ThreadExample1();
		ThreadExample2 obj2 = new ThreadExample2();

		obj1.setPriority(Thread.MAX_PRIORITY - 1);
		System.out.println(obj1.getPriority());
		obj1.start();
		obj2.start();
	}
}