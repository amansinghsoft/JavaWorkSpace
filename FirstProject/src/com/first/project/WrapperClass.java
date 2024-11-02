package com.first.project;

public class WrapperClass {

	public static void main(String[] args) {
		int num1 = 3;
		Integer num2 = new Integer(7); // Line 7 & 8 are same
		Integer num3 = 6; // auto-boxing

		System.out.println(num2 + num3 + num1);

		int num4 = num3.intValue(); // Line 12 & 13 are same
		int num5 = num2; // auto-unboxing

		System.out.println(num4 + num5);

		String str = "2";
		int num = Integer.parseInt(str);

		System.out.println(num * 3);

	}

}
