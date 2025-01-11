package com.first.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// we can also use Scanner for input
public class TryWithFinally {

	public static void main(String[] args) throws IOException {
		int num = 0;
		BufferedReader bf = null;

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			bf = new BufferedReader(in);
			System.out.println("Enter number: ");
			num = Integer.parseInt(bf.readLine());
			System.out.println("the output is : " + num);
		} finally {
			bf.close();
		}

	}

}
