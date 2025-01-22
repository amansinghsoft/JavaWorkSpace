package practice;

public class SortInsertionExample01 {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 78, 65, 76, 44, 54, 65 };
		int size = arr.length;

		System.out.println("Before Shorting");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		System.out.println();

		System.out.println("After Shorting");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
