package com.careerit.coursestat.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class ConnectionUtil {

	private static ConnectionUtil util = null;
	private Properties properties;

	private ConnectionUtil() {
		try {
			properties = new Properties();
			properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ConnectionUtil getInstance() {
		if (util == null) {
			synchronized (ConnectionUtil.class) {
				if (util == null) {
					util = new ConnectionUtil();
				}
			}
		}
		return util;
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("While closing resources :" + e);
		}
	}
}
