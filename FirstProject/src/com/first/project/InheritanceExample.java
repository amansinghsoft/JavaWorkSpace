package com.first.project;

class Calc {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}

class AdvanceCalc extends Calc {
	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}

class PreAdvanceCalc extends AdvanceCalc { // MultiLevel Inheritance
	public int power(int n1, int n2) { // Math.pow() always return double value
		return (int) Math.pow(n1, n2); // TypeCasting
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		PreAdvanceCalc obj1 = new PreAdvanceCalc();

		System.out.println(obj1.add(22, 28));
		System.out.println(obj1.sub(30, 28));
		System.out.println(obj1.mul(2, 28));
		System.out.println(obj1.div(56, 28));
		System.out.println(obj1.power(5, 5));

	}

}
