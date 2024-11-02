package com.first.project;

@SuppressWarnings("serial")
class AmanException extends ArithmeticException{

	public AmanException(String str) {
		super(str);
	}
	
}
public class CustomException01 {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;

		try {
			j = 18 / i;
			if (j == 0)
				throw new AmanException("This is Custom Exception");
		} catch (AmanException e) {
			j = 18 / 1;
			System.out.println("Error in arithmetic  " + e); // e shows the exception that occur.
		} catch (Exception e) {
			System.out.println("Somthing wrong  " + e);
		}
		System.out.println(j);
		System.out.println("Hiii");

	}

}
