package com.first.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader01 {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);

		System.out.println("Enter number: ");
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);

		bf.close();

	}

}
