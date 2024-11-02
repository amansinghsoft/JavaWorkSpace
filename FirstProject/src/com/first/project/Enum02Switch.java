package com.first.project;

enum Status1 {
	Running, Failed, Success, Pending;
}

public class Enum02Switch {

	public static void main(String[] args) {
		
		Status1 s = Status1.Failed;
		
		switch(s)
		{
		case Running:
			System.out.println("All good");
			break;
		
		case Failed:
			System.out.println("Try Again");
			break;
			
		case Success:
			System.out.println("Congrates!");
			break;
			
		default:
			System.out.println("Pls Wait");
			break;
		}
	}

}
