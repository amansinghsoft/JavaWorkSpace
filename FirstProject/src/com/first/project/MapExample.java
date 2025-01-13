package com.first.project;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<>();
		student.put("Aman", 65);
		student.put("Ram", 66);
		student.put("Mohan", 63);
		student.put("Shyam", 69);
		student.put("Radhe", 70);

		System.out.println(student.keySet());
		System.out.println(student.values());

		for (String name : student.keySet()) {
			System.out.println(name + " : " + student.get(name));
		}

	}

}
