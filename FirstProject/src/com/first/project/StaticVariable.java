package com.first.project;

class Mobile {
	String brand;
	int price;
	static String type;

	public void show() {
		System.out.println("Brand: " + brand + ", Price: " + price + ", Type: " + type);
	}
}

public class StaticVariable {

	public static void main(String[] args) {

		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 80000;
		Mobile.type = "SmartPhone"; // By static variable

		Mobile obj2 = new Mobile();
		obj2.brand = "OnePlus";
		obj2.price = 95000;

		obj1.show();
		obj2.show();

	}

}
