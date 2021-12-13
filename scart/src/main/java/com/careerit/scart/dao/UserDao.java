package com.careerit.scart.dao;

import com.careerit.scart.domain.User;

public interface UserDao {

		User insertUser(User user);
		User selectUser(String email);		
		boolean checkEmail(String email);
}
