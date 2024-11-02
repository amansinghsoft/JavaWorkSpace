package com.first.project;

abstract class Car{     //Abstract  Class
	public abstract void drive();//Abstract Method
	public abstract void fule();
	
	public void play() {
		System.out.println("I am playing music.");
	}
}

abstract class Swift extends Car{
	public  void drive() {
		System.out.println("I am Driving my car.");
	}
}

class UpdatedSwift extends Swift{  //Concrete class

	public void fule() {
		System.out.println("No fule.");
		
	}
	
}
public class AbstractKeyword {

	public static void main(String[] args) {
		
		Car obj = new UpdatedSwift(); //Reference of Abstract Class
		obj.drive();
		obj.play();
		obj.fule();

	}

}
