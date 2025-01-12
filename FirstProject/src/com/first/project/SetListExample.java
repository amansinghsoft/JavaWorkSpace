package com.first.project;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetListExample {

	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(43);
		nums.add(32);
		nums.add(98);
		nums.add(21);
		
		System.out.println(nums);

	}

}
