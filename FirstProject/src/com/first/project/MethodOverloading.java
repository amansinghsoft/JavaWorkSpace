package com.first.project;

class Calculator1 {
	public int add(int n1, int n2) {

		return n1 + n2;
	}

	public int add(int n1, int n2, int n3) {

		return n1 + n2 + n3;
	}

	public double add(double n1, int n2) {

		return n1 + n2;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {

		Calculator1 obj = new Calculator1();
		int sum1 = obj.add(32, 31);
		int sum2 = obj.add(24, 25, 67);
		double sum3 = obj.add(456.889, 32);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}

}
