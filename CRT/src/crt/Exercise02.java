package crt;

public class Exercise02 {

	public static void main(String[] args) {
		int i=0,j=0;
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if((i+j)%2==1) {
					System.out.print("0 ");
				}else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}
