package com.first.project.student;

public class FindTargetCorridinate {

	public static void main(String[] args){	
		//[2, 8, 11, 15, 7]
		//	 target=9;
		
		int target = 9;
		int arr[] = {2,8,11,-2};
		boolean flag = true;
		for(int i = 0; i<=arr.length-1;i++)
		{
			for(int j =0 ; j<=i; j++)
			{
				if(arr[i]+arr[j] == target) {
					System.out.println("Found corrdinates are " + arr[i] + " and "+ arr[j]);
					flag = false;
				}
				
			}
		}
		if(flag) {
			System.out.println("No corridinates match the target: "+target);
		}
	}

}
