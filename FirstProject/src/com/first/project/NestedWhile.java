package com.first.project;

public class NestedWhile {

	public static void main(String1[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println("Hii!" + i);

			int j = 1;
			while (j <= 3) {
				System.out.println("Hello!" + j);
				j++;
			}

			i++;
		}

	}

}
