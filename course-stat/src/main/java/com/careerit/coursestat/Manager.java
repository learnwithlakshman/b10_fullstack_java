package com.careerit.coursestat;

import com.careerit.coursestat.dao.CourseStatDao;
import com.careerit.coursestat.dao.CourseStatDaoImpl;

public class Manager {

	public static void main(String[] args) {

		CourseStatDao obj = new CourseStatDaoImpl();

		int count = obj.getTotalStudents();
		System.out.println(count);
	}
}
