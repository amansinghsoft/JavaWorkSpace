package practice;

public class SortBubbleexample {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 78, 65, 76, 44, 54, 65 };
		int size = arr.length;
		int temp = 0;

		System.out.println("Before Shorting");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println();
			for (int num : arr) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		System.out.println("After Shorting");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
