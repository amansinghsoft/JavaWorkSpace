package practice;

public class ArrayLinearSearch02 {

	public static void main(String[] args) { 
		int arr[] = { 4, 5, 6, 7, 65, 76, 65 };
		int targat = 65;

		int result = LinearSearch(arr, targat);
		if (result != -1) {
			System.out.println("Targat is found at index : " + result);
		} else {
			System.out.println("Targat is not found at index. ");
		}

	}

	public static int LinearSearch(int[] arr, int targat) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targat)
				return i;
		}
		return -1;
	}
}
