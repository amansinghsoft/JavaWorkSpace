package com.first.project;

public class ConstructorExample {

	private String name;
	private int age;

	public ConstructorExample() { // Default Constructor
		age = 21;
		name = "Aman";
	}

	public ConstructorExample(String name, int age) { // Parameterize Constructor
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		ConstructorExample obj1 = new ConstructorExample();
		System.out.println(obj1.name + ": " + obj1.age);

		ConstructorExample obj2 = new ConstructorExample("Ram", 22);
		System.out.println(obj2.name + ": " + obj2.age);

	}

}
