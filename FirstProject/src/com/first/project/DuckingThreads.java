package com.first.project;

class A3 {
	public void show() throws ClassNotFoundException {

		Class.forName("DuckingThreads"); // Use for find class name.
	}
}

public class DuckingThreads {

	public static void main(String[] args) {
		A3 obj = new A3();

		try {
			obj.show();
		} catch (ClassNotFoundException e) {

//			e.printStackTrace();
			System.out.println("Somthing wrong  " + e);
		}

	}

}
