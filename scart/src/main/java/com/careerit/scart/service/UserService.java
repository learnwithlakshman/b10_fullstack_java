package com.careerit.scart.service;

import com.careerit.scart.domain.User;

public interface UserService {

		User registerUser(User user);
		User login(String email,String password);
}
