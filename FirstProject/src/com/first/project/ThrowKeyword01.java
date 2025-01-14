package com.first.project;

public class ThrowKeyword01 {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;

		try {
			j = 18 / i;
			if (j == 0)
				throw new ArithmeticException("This is error");
		} catch (ArithmeticException e) {
			j = 18 / 1;
			System.out.println("Error in arithmetic  " + e); // e shows the exception that occur.
		} catch (Exception e) {
			System.out.println("Somthing wrong  " + e);
		}
	}

}
