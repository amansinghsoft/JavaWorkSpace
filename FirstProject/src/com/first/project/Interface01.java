package com.first.project;

interface Demo {

	int num = 87; // Final and Static
	String name = "Aman";

	void show(); // Methods are Abstract and public

	void display();

}

class Interfaces implements Demo {
	public void show() {
		System.out.println("I am Aman.");
	}

	public void display() {
		System.out.println("I am in display.");
	}
}

public class Interface01 {

	public static void main(String[] args) {

		Demo obj = (Demo) new Interfaces(); // Cast of Demo
		obj.display();
		obj.show();

		System.out.println(Demo.name); // Call by interface name.s
		System.out.println(Demo.num);
	}

}
