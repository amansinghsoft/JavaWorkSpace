package com.first.project;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable obj1 = () -> // Lambda Function
		{								  // this types of classes are classes anonymous class
			for (int i = 0; i < 5; i++) { // this is applicable for only one class
				System.out.println("Aman Singh");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};
		Runnable obj2 = () -> // Lambda Function
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("i am Aman.");
				try {
					Thread.sleep(9);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}

}
