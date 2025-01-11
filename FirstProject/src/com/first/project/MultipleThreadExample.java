package com.first.project;

class Hii extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Hiii");
			try {
				Thread.sleep(10); // Sleep in Thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10); // Sleep in Thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultipleThreadExample {

	public static void main(String[] args) {
		Hii obj1 = new Hii();
		Hello obj2 = new Hello();

		System.out.println(obj1.getPriority()); // For getting Priority
		obj1.setPriority(Thread.MAX_PRIORITY); // For setting Priority

		obj1.start();
		System.out.println("Hello");
		try { // This for The program should run for equal interval of time or for optimizing
				// it
			Thread.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();

	}

}
