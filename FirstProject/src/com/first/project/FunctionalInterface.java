package com.first.project;

//@FunctionalInterface
interface A1 {
	void show(int i);
}

//class B1 implements A1 {
//	public void show() {
//		System.out.println("I am in Show");
//	}
//}

public class FunctionalInterface {

	public static void main(String[] args) {
		A1 obj = (i) -> 	System.out.println("I am in Show  " + i); // Anonymous Inner Class  // Lambda Expression
	
		obj.show(6);

	}

}
