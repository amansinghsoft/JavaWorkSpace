package com.first.project;

@Deprecated  // Annotation
class Parent1{
	public void show() {
		System.out.println("I am in Parent Class.");
	}
}

class Child extends Parent1{

	@Override   //Annotation
	public void show() {
		System.out.println("I am in Child Class.");
	}
}
public class Annotation01 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();

	}

}
