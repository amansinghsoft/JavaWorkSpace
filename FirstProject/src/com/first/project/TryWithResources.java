package com.first.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws IOException {

		int num = 0;
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) //it will close the resource automatically
		{

			System.out.println("Enter number: ");
			num = Integer.parseInt(bf.readLine());
			System.out.println("the output is : " + num);
		}

	}

}
