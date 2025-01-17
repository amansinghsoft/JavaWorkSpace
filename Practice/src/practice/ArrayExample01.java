package practice;

import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = scanner.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements -> ");

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element for " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}

//		This is with normal for loop
//		System.out.println("The Array for given input is ->");
//		for (int i = 0; i < size; i++) {
//			System.out.print(arr[i] + ", ");
//		}

//		This is with for-each loop.
		System.out.println("The Array for given input is ->");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		scanner.close();

	}

}
