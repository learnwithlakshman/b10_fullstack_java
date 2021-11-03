package com.careerit.coursestat;

import java.util.List;
import java.util.Scanner;

import com.careerit.coursestat.dao.CourseStatDao;
import com.careerit.coursestat.dao.CourseStatDaoImpl;
import com.careerit.coursestat.domain.Student;
import com.careerit.coursestat.dto.StatusCountDTO;

public class Manager {

	public static void main(String[] args) {

		CourseStatDao obj = new CourseStatDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.Student By qualification");
			System.out.println("2.Student count");
			System.out.println("3.Placed and not planced count");
			System.out.println("4.Exit");
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the qualification  ex (MCA/BE/B.Tech/BCA) :");
				sc.nextLine();
				String qual = sc.nextLine();
				List<Student> list = obj.getStatudentsByQualification(qual);
				showStudentDetails(list,qual);
				break;
			case 2:
				int count = obj.getTotalStudents();
				System.out.println("Student count is :"+count);
				break;
			case 3:
				StatusCountDTO statusCountDTO = obj.getPlacedStatus();
				System.out.println("Placed "+statusCountDTO.getPlacedCount());
				System.out.println("Not Placed "+statusCountDTO.getNotPlacedCount());
				break;
			case 4:
				sc.close();
				System.out.println("Bye..... application is going to stop");
				System.exit(0);
			default:
				System.out.println("Please enter valid option (1-4) only");
			}
		}
	
	}

	private static void showStudentDetails(List<Student> list,String qual) {
		if(list.size() == 0) {
			System.out.println("There no students found for the qualification :"+qual);
		}else {
			System.out.println("--------------------- Students of "+qual+" -----------------------");
			list.stream().forEach(s->{
				System.out.println(s.getName());
				System.out.println(s.getQualification());
				System.out.println(s.getScore());
				System.out.println("----------------------------------");
			});
		}
		
		
	}
}
