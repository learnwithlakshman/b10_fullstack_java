package com.careerit.coursestat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.coursestat.domain.Student;
import com.careerit.coursestat.dto.StatusCountDTO;
import com.careerit.coursestat.dto.StudentStatDTO;
import com.careerit.coursestat.util.ConnectionUtil;

public class CourseStatDaoImpl implements CourseStatDao {

	private ConnectionUtil util = ConnectionUtil.getInstance();
	private final String STUDENT_BY_QUAL = "select name, batch, status, placed, qualification, score from student where qualification=?";
	private final String COUNT_STUDENTS = "select count(*) as count from student";
	private final String COUNT_PLACED = "select placed,count(*) as count from student group by placed;";

	@Override
	public List<Student> getStatudentsByQualification(String qual) {

				
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		List<Student> list = new ArrayList<Student>();

		try {
			con = util.getConnection();
			st = con.prepareStatement(STUDENT_BY_QUAL);
			st.setString(1, qual);
			rs = st.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String batch = rs.getString("batch");
				String status = rs.getString("status");
				String placed = rs.getString("placed");
				String qualification = rs.getString("qualification");
				double score = rs.getDouble("score");

				Student student = new Student(name, batch, status, placed, qualification, score);
				list.add(student);
			}
		} catch (SQLException e) {
			System.out.println("While getting students by qualification :" + e);
		}

		return list;
	}

	@Override
	public int getTotalStudents() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		try {
			con = util.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(COUNT_STUDENTS);
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, st, con);
		}
		return count;
	}

	@Override
	public StatusCountDTO getPlacedStatus() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		StatusCountDTO stuCountDTO = new StatusCountDTO();
		try {
			con = util.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(COUNT_PLACED);
			while(rs.next()) {
				String status = rs.getString("placed");
				int count = rs.getInt("count");
				if(status.equals("Y")) {
					stuCountDTO.setPlacedCount(count);
				}else {
					stuCountDTO.setNotPlacedCount(count);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, st, con);
		}
		return stuCountDTO;
	}

	@Override
	public List<Student> getMaxScoredStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentStatDTO getStudentStat() {
		// TODO Auto-generated method stub
		return null;
	}

}
