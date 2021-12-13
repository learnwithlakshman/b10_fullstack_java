package com.careerit.scart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.careerit.scart.dao.util.ConnectionUtil;
import com.careerit.scart.domain.User;

public class UserDaoImpl implements UserDao {

	private final String INSERT_USER = "insert into app_user(name,email,password) values(?,?,?)";
	private final String GET_USER_BY_EMAIL = "select uid,name,email,password from app_user where email = ?";

	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User selectUser(String inEmail) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		User user = null;
		try {
			con = ConnectionUtil.getConnection();
			st = con.prepareStatement(GET_USER_BY_EMAIL);
			st.setString(1, inEmail);
			rs = st.executeQuery();
			if (rs.next()) {
				long uid = rs.getLong("uid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				user = new User();
				user.setEmail(email);
				user.setUserId(uid);
				user.setPassword(password);
				user.setName(name);
			}
		} catch (SQLException e) {
			System.out.println("While getting user with email :" + inEmail + " got :" + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}
		return user;
	}

	

}
