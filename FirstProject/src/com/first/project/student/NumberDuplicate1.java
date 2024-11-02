package com.first.project.student;

import java.util.Arrays;

public class NumberDuplicate1 {

	public static void main(String[] args) {
		// int arr[] = new int[10];
		 int arr[] = {2,3,4,5,2,3,4};
		 int result[]= new int[arr.length ];
		 int temp =0;
		 
		 Arrays.sort(arr);
		 
		 
		 
		 for (int i = 0; i < arr.length; ++i) {
			  if (i == 0 || arr[i] != arr[i - 1]) {
	                result[temp++] = arr[i];
	            }
		    }
		 for (int i = 0; i < temp; ++i) {
		        System.out.print(result[i] + " ");
		    }

	}

}
