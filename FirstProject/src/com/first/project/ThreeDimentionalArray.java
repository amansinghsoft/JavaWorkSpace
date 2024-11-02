package com.first.project;

public class ThreeDimentionalArray {

	public static void main(String1[] args) {
		int num[][][] = new int[3][3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					num[i][j][k] = (int) (Math.random() * 10);
				}

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(num[i][j][k] + " ");
				}
			}
			System.out.println();
		}

	}

}
