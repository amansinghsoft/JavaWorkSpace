package com.first.project;

class Example {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
		Example obj1 = new Example();
		obj1.setAge(54);
		obj1.setName("Aman");

		System.out.println(obj1.getName() + " : " + obj1.getAge());

	}

}
