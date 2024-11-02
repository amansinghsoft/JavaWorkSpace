package com.first.project;

class Student {
	int Roll;
	String Name;
	int Marks;
}

public class ObjectOfArray {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Roll = 1;
		s1.Name = "Aman";
		s1.Marks = 87;

		Student s2 = new Student();
		s2.Roll = 2;
		s2.Name = "Mohan";
		s2.Marks = 88;

		Student s3 = new Student();
		s3.Roll = 3;
		s3.Name = "Ram";
		s3.Marks = 89;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].Roll + ": " + students[i].Name + " -> " + students[i].Marks);
		}
	}

}
