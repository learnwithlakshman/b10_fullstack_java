package com.careerit.cj.day3;

import java.util.Scanner;

public class GradeSystem {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the marks :");
				int marks = sc.nextInt();
				
				String grade = "";
			
				if(marks > 90 && marks<=100) {
					grade = "A";
				}else if(marks >70 && marks<=90) {
					grade = "B";
				}else if(marks >50 && marks <= 70) {
					grade = "C";
				}else {
					grade = "D";
				}
				System.out.println("Dear you have scored :"+marks+" and grade is :"+grade);
				sc.close();
		}
}
