package com.first.project;

class Parent {
	public void show() {
		System.out.println("I am in Parent class.");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Parent obj = new Parent() {  // This is Anonymous Class.
			public void show() 
			{
				System.out.println("I am in Anonymous class.");
			}
		};
		
		obj.show();

	}

}
