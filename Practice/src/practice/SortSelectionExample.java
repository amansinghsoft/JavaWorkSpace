package practice;

public class SortSelectionExample {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 78, 65, 76, 44, 54, 65 };
		int size = arr.length;
		int temp = 0;
		int minIndex = 0;
		
		System.out.println("Before Shorting");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
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
