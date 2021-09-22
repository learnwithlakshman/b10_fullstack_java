package com.careerit.cj.day14;

public class Manager {

	public static void main(String[] args) {

		Student student1 = new Student("10X20CS05", "Naresh", 1);
		Student student2 = new Student("10X20IS05", "Krish", 3);
		Student student3 = new Student("10X20IS06", "Manoj", 2);
		Student student4 = new Student("10X20IS07", "Mahesh", 3);
		Student student5 = new Student("10X20IS10", "Jayesh", 2);
		Student student8 = new Student("10X20IS11", "Mani", 2);
		Student student9 = new Student("10X20IS10", "RK", 3);

		// Display students details of sem 2

		Student[] arr = new Student[] { student1, student2, student3, student4, student5, student8, student9 };

		for (Student stu : arr) {

			if (stu.getSem() == 2) {
				stu.showInfo();
				System.out.println("-".repeat(100));
			}
		}
		
		// Promote all the students
		
		
		for (Student stu : arr) {
			stu.promote();
		}
		
		// Show all student details
		
		System.out.println("-".repeat(100));
		System.out.println("        Student Details          ");
		System.out.println("-".repeat(100));
		
		for (Student stu : arr) {
			stu.showInfo();
			System.out.println("\n");
		}
		
		
	}
}
