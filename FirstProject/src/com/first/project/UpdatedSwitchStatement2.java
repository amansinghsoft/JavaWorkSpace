package com.first.project;

public class UpdatedSwitchStatement2 {

	public static void main(String1[] args) {
		String day = "Monday";
		String result = "";

		switch (day) {
		case "Monday" -> result = "7am";
		case "Saturday", "Sunday" -> result = "8am";
		default -> result = "7:30";
		}

		System.out.println("I have to wake up at " + result);

	}

}
