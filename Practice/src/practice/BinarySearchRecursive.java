package practice;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 65, 76 };
		int target = 76;
		int left = 0;

		int result = BinarySearch(arr, target, left, arr.length - 1);
		if (result != -1) {
			System.out.println("target is found at index : " + result);
		} else {
			System.out.println("target is not found at index. ");
		}

	}

	public static int BinarySearch(int[] arr, int target, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {

				return mid;

			} else if (arr[mid] < target) {
				return BinarySearch(arr, target, mid + 1, right);

			} else {
				return BinarySearch(arr, target, left, mid - 1);
			}
		}
		return 0;
	}

}
