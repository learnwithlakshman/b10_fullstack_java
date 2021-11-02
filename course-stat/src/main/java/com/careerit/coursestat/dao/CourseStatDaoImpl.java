package com.careerit.coursestat.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.careerit.coursestat.domain.Student;
import com.careerit.coursestat.dto.StatusCountDTO;
import com.careerit.coursestat.util.ConnectionUtil;

public class CourseStatDaoImpl implements CourseStatDao {

	private ConnectionUtil util = ConnectionUtil.getInstance();

	@Override
	public List<Student> getStatudentsByQualification(String qualification) {
		return null;
	}

	@Override
	public int getTotalStudents() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		String COUNT_STUDENTS = "select count(*) as count from student";
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
		return null;
	}

}
