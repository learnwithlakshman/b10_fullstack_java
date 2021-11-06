package com.careerit.coursestat;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.careerit.coursestat.util.ConnectionUtil;


public class CrudManager {

	public static void main(String[] args) {

		//createTable();
		//insertData("Lenovo Thinkpad", 45000);
		//insertData("Dell Thinkpad", 55000);
		
		//updateData();
		//deleteData(2);
		
		sum_number(99,1);
		
		empCountByLocationAndGrade("NEW YORK",4);
	}

	private static void createTable() {
		ConnectionUtil util = ConnectionUtil.getInstance();
		String sql = "create table product(id int primary key auto_increment,name varchar(100),price float)";
		Connection con = null;
		Statement st = null;
		try {
			con = util.getConnection();
			st = con.prepareStatement(sql);
			st.execute(sql);

		} catch (SQLException e) {
			System.out.println("While getting students by qualification :" + e);
		} finally {
			util.close(st, con);
		}

	}

	private static void insertData(String pname,double price) {
		ConnectionUtil util = ConnectionUtil.getInstance();
		Connection con = null;
		PreparedStatement st = null;
		String query = "insert into product(name,price) values(?,?);";
		
		try {
			con = util.getConnection();
			st = con.prepareStatement(query);
			st.setString(1, pname);
			st.setDouble(2, price);
			int res= st.executeUpdate();
			System.out.println(res+" records are inserted or updated");
		} catch (SQLException e) {
			System.out.println("While adding product:" + e);
		}finally {
			util.close(st, con);
		}

	
	}

	private static void updateData() {
		ConnectionUtil util = ConnectionUtil.getInstance();
		Connection con = null;
		PreparedStatement st = null;
		String query = "update product set price = (price - (price * 0.05)); ";
		
		try {
			con = util.getConnection();
			st = con.prepareStatement(query);
     		int res= st.executeUpdate();
			System.out.println(res+" records are inserted or updated");
		} catch (SQLException e) {
			System.out.println("While adding product:" + e);
		}finally {
			util.close(st, con);
		}

	}

	private static void deleteData(int pid) {
		ConnectionUtil util = ConnectionUtil.getInstance();
		Connection con = null;
		PreparedStatement st = null;
		String query = "delete from product where id = ? ";
		
		try {
			con = util.getConnection();
			st = con.prepareStatement(query);
			st.setInt(1,pid);
     		int res= st.executeUpdate();
			System.out.println(res+" records are inserted or updated");
		} catch (SQLException e) {
			System.out.println("While deleting product:" + e);
		}finally {
			util.close(st, con);
		}

	}
	
	private static void empCountByLocationAndGrade(String loc,int grade) {
		ConnectionUtil util = ConnectionUtil.getInstance();
		Connection con = null;
		CallableStatement st = null;
		try {
			con = util.getConnection();
			st = con.prepareCall("{call emp_count_by_loc_grade(?,?,?)}");
			st.registerOutParameter(1, Types.INTEGER);
			st.setString(2, loc);
			st.setInt(3, grade);
			st.execute();
			int count = st.getInt(1);
			System.out.println(loc+" has "+count+" employee with grade "+grade);
		}catch (SQLException e) {
			System.out.println("While getting employee count:" + e);
			e.printStackTrace();
		}finally {
			util.close(st, con);
		}
	}
	
	private static void sum_number(int num1,int num2) {
		ConnectionUtil util = ConnectionUtil.getInstance();
		Connection con = null;
		CallableStatement st = null;
		try {
			con = util.getConnection();
			st = con.prepareCall("{call add_number(?,?,?)}");
			st.registerOutParameter(3, Types.INTEGER);
			st.setInt(1, num1);
			st.setInt(2, num2);
			st.execute();
			int sum = st.getInt(3);
			System.out.println(num1+" + "+num2+" = "+sum);
			
		}catch (SQLException e) {
			System.out.println("While getting employee count:" + e);
			e.printStackTrace();
		}finally {
			util.close(st, con);
		}
	}

}


