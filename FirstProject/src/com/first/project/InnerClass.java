package com.first.project;

class Base{
	int num;
	public void show() {
		System.out.println("In Base class.");
	}
	
	class Inner{
		public void show1() {
			System.out.println("In inner class");
		}
	}
	
	static class PreInner{
		public void show2() {
			System.out.println("In preInner class");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		
		Base obj = new Base();
		obj.show();
		
		Base.Inner obj1 = obj.new Inner();  // Base.Inner means Inner belongs to Base & 
		obj1.show1(); 						// obj.new Inner() means object of Inner class is object of Base class

		Base.PreInner obj2 = new Base.PreInner();  // For static class
		obj2.show2();
	}

}
