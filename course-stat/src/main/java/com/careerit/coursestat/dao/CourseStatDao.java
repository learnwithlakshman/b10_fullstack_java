package com.careerit.coursestat.dao;

import java.util.List;

import com.careerit.coursestat.domain.Student;
import com.careerit.coursestat.dto.StatusCountDTO;
import com.careerit.coursestat.dto.StudentStatDTO;

public interface CourseStatDao {

	public List<Student> getStatudentsByQualification(String qualification);
	public int getTotalStudents();
	public StatusCountDTO getPlacedStatus();
	
	public List<Student> getMaxScoredStudents();
	public List<String> getNames();
	public StudentStatDTO getStudentStat();
}
