package com.careerit.cbookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.careerit.cbookapp.domain.AppUser;
import com.careerit.cbookapp.dto.AppUserDTO;
import com.careerit.cbookapp.excpetion.BadCredentialsException;
import com.careerit.cbookapp.excpetion.UserAlreadyExistsException;
import com.careerit.cbookapp.excpetion.UserNotFoundException;
import com.careerit.cbookapp.util.ConnectionUtil;

public class AppUserDaoImpl implements AppUserDao {

	private final String LOAD_USER_BY_EMAIL = "select * from app_user where email = ?";
	private final String REGISTER_APP_USER = "insert into app_user(username,email,password) values(?,?,?);";

	private ConnectionUtil util = ConnectionUtil.getInstance();

	public AppUserDTO login(String email, String password) throws UserNotFoundException, BadCredentialsException {

		try {
			AppUser appUser = loadUserByEmail(email);
			if (appUser != null) {
				if (appUser.getPassword().equals(password)) {
					AppUserDTO appUserDTO = new AppUserDTO();
					appUserDTO.setEmail(appUser.getEmail());
					appUserDTO.setUsername(appUser.getUsername());
					appUserDTO.setUid(appUser.getUid());
					return appUserDTO;
				}
				throw new BadCredentialsException("Username/password is not matching");

			}
		} catch (UserNotFoundException e) {
			throw e;
		}
		return null;
	}

	public AppUserDTO registerUser(AppUser appUser) throws UserAlreadyExistsException  {
		
		AppUser user = null;
		AppUserDTO appUserDTO = new AppUserDTO();
		Connection con = null;
		PreparedStatement st = null;
		
		try {
		   user = loadUserByEmail(appUser.getEmail());
		}catch (UserNotFoundException e) {
			try {
				con = util.getConnection();
				st = con.prepareStatement(REGISTER_APP_USER);
				st.setString(1, appUser.getUsername());
				st.setString(2, appUser.getEmail());
				st.setString(3, appUser.getPassword());
				int count = st.executeUpdate();
				if(count != 0) {
					appUserDTO.setUsername(appUser.getUsername());
					appUserDTO.setEmail(appUser.getEmail());
				}
			}catch (SQLException se) {
				System.out.println("While registring user :"+se);
			}finally {
				util.close(st, con);
			}
		}
		
		if(user != null) {
			throw new UserAlreadyExistsException("User with email :"+appUser.getEmail()+" already is taken by some one else");
		}
		
		return appUserDTO;
	}

	public AppUser loadUserByEmail(String email) throws UserNotFoundException {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		AppUser appUser = null;
		try {
			con = util.getConnection();
			st = con.prepareStatement(LOAD_USER_BY_EMAIL);
			st.setString(1, email);
			rs = st.executeQuery();
			if (rs.next()) {
				appUser = new AppUser();
				appUser.setUid(rs.getLong("uid"));
				appUser.setEmail(rs.getString("email"));
				appUser.setPassword(rs.getString("password"));
				appUser.setUsername(rs.getString("username"));
				return appUser;
			}
			throw new UserNotFoundException("User with email :" + email + " is not found");
		} catch (SQLException e) {
			System.out.println("Loading the user with email :" + email + " got " + e);
		}
		return null;
	}

}
