package practice;

public class SortMergeExample01 {

	private static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {

			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);

			merge(arr, l, mid, r);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 45, 65, 34, 23, 54, 24, 98 };

		System.out.println("Before Sorting :");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("");
		System.out.println("After Sorting :");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int lArr[] = new int[n1];
		int rArr[] = new int[n2];

		for (int x = 0; x < n1; x++) {
			lArr[x] = arr[l + x];
		}

		for (int y = 0; y < n2; y++) {
			rArr[y] = arr[mid + 1 + y];
		}

		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}
}
