package com.first.project;

class Overriding {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
}

class Overriding1 extends Overriding {
	public int add(int n1, int n2) {
		return n1 + n2 + 1;
	}
}

public class MetodOverriding {

	public static void main(String[] args) {
		Overriding1 obj1 = new Overriding1();

		System.out.println(obj1.add(4, 4));

	}

}
