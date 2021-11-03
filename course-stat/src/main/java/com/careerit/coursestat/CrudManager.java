package com.careerit.coursestat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.careerit.coursestat.util.ConnectionUtil;

public class CrudManager {

	public static void main(String[] args) {

		//createTable();
		//insertData("Lenovo Thinkpad", 45000);
		//insertData("Dell Thinkpad", 55000);
		
		//updateData();
		deleteData(2);
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

}


