package com.first.project;

public class LogicalOperator {

	public static void main(String1[] args) {

		int a = 7;
		int b = 6;
		int c = 5;
		boolean result1 = a > b && a > c;
		boolean result2 = a > b || a < c;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(!result1); // example of not operator
	}

}
