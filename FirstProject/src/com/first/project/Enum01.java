package com.first.project;

enum Status {
	Running, Failed, Success, Pending;
}

public class Enum01 {

	public static void main(String[] args) {

		Status[] s = Status.values();  // Object

		for (Status ss : s) {  //Enhance for loop
			System.out.println(ss + " " + ss.ordinal());
		}

	}

}
