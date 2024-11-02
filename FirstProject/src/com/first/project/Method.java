package com.first.project;

class Computer {
	public void Music() {
		System.out.println("Playing music...");
	}

	public String Pen(int cost) {
		if (cost >= 10) {
			return "Affordable";
		} else {
			return "Nothing";
		}
	}
}

public class Method {
	public static void main(String1[] args) {

		Computer obj = new Computer();
		obj.Music();

		String str = obj.Pen(1);
		System.out.println(str);

	}

}
