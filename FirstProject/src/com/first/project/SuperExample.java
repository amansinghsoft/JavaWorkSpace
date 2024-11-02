package com.first.project;

//Super Method in java

class Test {
	public Test() {
		super();
		System.out.println("Hii I am Aman");
	}

	public Test(int n) {
		super();
		System.out.println(n);
	}
}

class Example1 extends Test {

	public Example1() {
		super();
		System.out.println("Hii How are you?");
	}

	public Example1(int n) {
		this();
		System.out.println("Ram");
	}

}

public class SuperExample {

	public static void main(String[] args) {

		Example1 obj1 = new Example1(3);

	}

}
