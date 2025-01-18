package practice;

import java.util.Scanner;

public class ArrayLinearSearch01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scanner.nextInt();
		System.out.print("Enter the number which you want to search : ");
		int num = scanner.nextInt();
		int count = 0;
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element for " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < (size - 1); i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Number found");
		} else {
			System.out.println("Number not found");
		}

	}

}
