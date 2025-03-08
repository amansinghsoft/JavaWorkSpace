package crt;

public class Exercise01 {

	public static void main(String[] args) {
		int count = 1;
		int i = 0, j = 0;

		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {

				System.out.print(count+ " ");

				count++;
			}
			System.out.println();
		}

	}

}

/* 
1
2 3 
4 5 6 
7 8 9 10 
*/