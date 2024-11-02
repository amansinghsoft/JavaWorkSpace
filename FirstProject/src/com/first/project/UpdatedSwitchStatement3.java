package com.first.project;

public class UpdatedSwitchStatement3 {

	public static void main(String1[] args) {
		String day = "Monday";
		String result = "";

		result = switch (day) {
		case "Monday" -> "7am";
		case "Saturday", "Sunday" -> "8am";
		default -> "7:30";
		};

		System.out.println("I have to wake up at " + result);

	}

}
