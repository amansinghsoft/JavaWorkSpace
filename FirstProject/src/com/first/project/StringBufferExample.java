package com.first.project;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Aman");

		System.out.println(name.capacity());
		System.out.println(name.length());

		name.append("Singh");
		System.out.println(name);

	}

}
