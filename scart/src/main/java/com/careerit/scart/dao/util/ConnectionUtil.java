package com.careerit.scart.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class ConnectionUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("While loading driver :" + e);
		}
	}

	private ConnectionUtil() {

	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scart", "dbuser", "dbuser");

		} catch (Exception e) {
			System.out.println("While getting connection with db:" + e);
		}
		return con;

	}

	public static void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();

		} catch (Exception e) {
			System.out.println("While closing resources :" + e);
		}
	}

	public static void close(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();

		} catch (Exception e) {
			System.out.println("While closing resources :" + e);
		}
	}

}
