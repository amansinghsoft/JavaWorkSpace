package com.first.project.student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,1,4};
		
		int result[]= new int[arr.length ];
		int temp = 0;
		int len = arr.length;
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1; i++) {
			
			if(arr[i] != arr[i+1]) {
				result[temp++] = arr[i];
			}
		}
		result[len-1] = arr[arr.length-1];
		for(int i=0;i<len;i++) {
		System.out.print(result[i] + " ");
		
		}
		System.out.println();
		//Second approach
		Set<Integer> set = new HashSet<>(); 
		for(int i =0; i<= arr.length-1;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
