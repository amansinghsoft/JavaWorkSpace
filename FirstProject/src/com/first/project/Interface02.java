package com.first.project;

interface Computer1 {
	void code();
}

class Desktop implements Computer1 {
	public void code() {
		System.out.println("I am in Desktop.");
	}
}

class Laptop1 implements Computer1 {
	public void code() {
		System.out.println("I am in Laptop.");
	}
}

class Display {
	public void show(Computer1 comp) {
		comp.code();
	}
}

public class Interface02 {

	public static void main(String[] args) {
		Computer1 obj1 = new Desktop();
		Computer1 obj2 = new Laptop1();

		Display dev = new Display();
		dev.show(obj1);
		dev.show(obj2);

	}

}
