package practice;
class home{
	int age;
	int marks;
	public home(int age, int marks) {
		super();
		this.age = age;
		this.marks = marks;
	}
	public void show() {
		System.out.println(age);
		System.out.println(marks);
	}
}
public class InheritanceExample01 {
public static void main(String [] args) {
	
	home obj = new home(7, 90);
	obj.show();
	
	}
}
