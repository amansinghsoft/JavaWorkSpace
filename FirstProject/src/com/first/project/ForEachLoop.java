package com.first.project;

class Student1 {
	int Roll;
	String Name;
	int Marks;
}

public class ForEachLoop {

	public static void main(String1[] args) {
		Student1 s1 = new Student1();
		s1.Roll = 1;
		s1.Name = "Aman";
		s1.Marks = 87;

		Student1 s2 = new Student1();
		s2.Roll = 2;
		s2.Name = "Mohan";
		s2.Marks = 88;

		Student1 s3 = new Student1();
		s3.Roll = 3;
		s3.Name = "Ram";
		s3.Marks = 89;

		Student1 students[] = new Student1[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (Student1 stud : students) {
			System.out.println(stud.Roll + ": " + stud.Name + " -> " + stud.Marks);
		}
	}

}
