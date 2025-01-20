package practice;

public class BinarySearchExample {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 7, 65, 76 };
		int target = 76;

		int result = BinarySearch(arr, target);
		if (result != -1) {
			System.out.println("target is found at index : " + result);
		} else {
			System.out.println("target is not found at index. ");
		}
	}

	public static int BinarySearch(int[] arr, int target) {

		int steps = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			steps++;
			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				System.out.println("total steps: " + steps);
				return mid;

			} else if (arr[mid] < target) {
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}

		return -1;
	}
}
