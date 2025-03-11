package crt;

public class Exercise05 {

	public static void main(String[] args) {
		long n = 9661489725L; // L is for long number
		long temp = n;
		int count = 0;

		while (temp > 0) {
			count++;
			temp /= 10;
		}
		
		int[] matrix = new int[count];
		temp = n;

		for (int i = count - 1; i >= 0; i--) {
			matrix[i] = (int) (temp % 10);
			temp /= 10;
		}
		
		for (int digit : matrix) {
			System.out.print(digit + " ");
		}
	}

}
