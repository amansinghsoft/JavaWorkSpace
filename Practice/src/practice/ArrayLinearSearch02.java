package practice;

public class ArrayLinearSearch02 {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 65, 76, 65 };
		int Target = 65;

		int result = LinearSearch(arr, Target);
		if (result != -1) {
			System.out.println("Target is found at index : " + result);
		} else {
			System.out.println("Target is not found at index. ");
		}

	}

	public static int LinearSearch(int[] arr, int Target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Target)
				return i;
		}
		return -1;
	}
}
