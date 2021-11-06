package com.careerit.cbookapp.dao;

import com.careerit.cbookapp.domain.AppUser;
import com.careerit.cbookapp.dto.AppUserDTO;
import com.careerit.cbookapp.excpetion.BadCredentialsException;
import com.careerit.cbookapp.excpetion.UserAlreadyExistsException;
import com.careerit.cbookapp.excpetion.UserNotFoundException;

public interface AppUserDao {

	AppUserDTO login(String email, String password)throws UserNotFoundException,BadCredentialsException;

	AppUserDTO registerUser(AppUser appUser)throws UserAlreadyExistsException;

	AppUser loadUserByEmail(String email)throws UserNotFoundException;

}
