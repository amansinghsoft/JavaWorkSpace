package com.first.project;

public class Exception01 {

	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		int num[] = new int[5];

		try {
			j = 18 / i;
			System.out.println(num[5]);
		} catch (ArithmeticException e) {
			System.out.println("Error in arithmetic  " + e); // e shows the exception that occur.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error in size of array  " + e);
		} catch (Exception e) {
			System.out.println("Somthing wrong  " + e);
		}
		System.out.println(j);
		System.out.println("Hiii");
	}

}
