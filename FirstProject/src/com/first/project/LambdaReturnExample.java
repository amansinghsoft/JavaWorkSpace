package com.first.project;

interface A2{
	int add(int i, int j);
}
public class LambdaReturnExample {

	public static void main(String[] args) {
		A2 obj = (i, j) -> i + j;

		int result = obj.add(6, 65);
		System.out.println(result);

	}

}
