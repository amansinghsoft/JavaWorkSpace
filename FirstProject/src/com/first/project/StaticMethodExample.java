package com.first.project;

class Phone {
	String brand;
	int price;
	static String type;

	public void show() {
		System.out.println("Brand: " + brand + ", Price: " + price + ", Type: " + type);
	}

	public static void show1(Phone obj) {
		System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Type: " + type);
	}

}

public class StaticMethodExample {

	public static void main(String[] args) {
		Phone obj1 = new Phone();

		obj1.brand = "Apple";
		obj1.price = 80000;

		Phone obj2 = new Phone();

		obj2.brand = "OnePlus";
		obj2.price = 85000;

		Phone.type = "SmartPhone";

		obj1.show();
		obj2.show();

		Phone.show1(obj1);
		Phone.show1(obj2);

	}

}
