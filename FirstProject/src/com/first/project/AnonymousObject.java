package com.first.project;

public class AnonymousObject {

	public AnonymousObject() {
		System.out.println("Object created");
	}

	public void show() {
		System.out.println("I am Aman");
	}

	public static void main(String[] args) {
		// AnonymousObject obj1 = new AnonymousObject();
		// obj1.show();

		new AnonymousObject().show(); // AnonymousObject WE can only call it once.

	}

}
