package com.first.project;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(65);
		nums.add(24);
		nums.add(23);

		System.out.println(nums.indexOf(23));

		System.out.println(nums);
		for (int n : nums) {
			System.out.println(n);
		}

	}

}
