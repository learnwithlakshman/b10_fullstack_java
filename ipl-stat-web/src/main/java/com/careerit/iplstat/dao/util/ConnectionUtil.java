package com.careerit.iplstat.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ConnectionUtil {

	private ConnectionUtil() {

	}
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/ipl_db";
		String username = "dbuser";
		String password = "dbuser";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("While connecting with db :" + e);
		}
		return con;
	}

	public static void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}

		} catch (SQLException e) {
			System.out.println("While closing resource :" + e);
		}
	}

	public static void close(Statement st, Connection con) {
		try {

			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}

		} catch (SQLException e) {
			System.out.println("While closing resource :" + e);
		}
	}
}
