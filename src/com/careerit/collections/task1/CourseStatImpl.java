package com.careerit.collections.task1;

import java.util.List;

public class CourseStatImpl implements CourseStat {

	
	private List<Student> students;
	
	public CourseStatImpl() {
		students = CsvReaderUtil.readDataFromFile();
	}

	@Override
	public List<Student> studentsByQualification(String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStudentCountByQualification(String qualification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNotPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CountDTO getPlacedAndNotPlacedCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float successRate(String batchName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> maxScoreStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getStudentNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
