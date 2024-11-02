package com.first.project;

public class UpdatedSwitchStatement1 {

	public static void main(String1[] args) {

		String day = "Sunday";

		switch (day) {
		case "Saturday", "Sunday" -> System.out.println("Wake up at 8am.");

		case "Monday" -> System.out.println("Wake up at 7am.");

		default -> System.out.println("Wake up at 7:30am.");
		}

	}

}
