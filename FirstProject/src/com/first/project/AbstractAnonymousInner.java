package com.first.project;

abstract class Eg {
	public abstract void show();

	public abstract void type();
}

public class AbstractAnonymousInner {

	public static void main(String[] args) {
		Eg obj = new Eg() {
			public void show() {
				System.out.println("I am in Abstact Anonymous Inner Class.");
			}

			public void type() {
				System.out.println("I am in Abstact Anonymous Inner Class.");
			}
		};

		obj.show();
		obj.type();
	}

}
