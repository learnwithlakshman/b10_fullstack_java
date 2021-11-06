package com.careerit.cbookapp;

import com.careerit.cbookapp.dao.AppUserDao;
import com.careerit.cbookapp.dao.AppUserDaoImpl;
import com.careerit.cbookapp.dao.ContactDao;
import com.careerit.cbookapp.dao.ContactDaoImpl;
import com.careerit.cbookapp.domain.AppUser;
import com.careerit.cbookapp.dto.AppUserDTO;
import com.careerit.cbookapp.excpetion.UserAlreadyExistsException;

public class Manager {

	
		public static void main(String[] args) throws UserAlreadyExistsException {
			
			
			AppUserDao appUserDao = new AppUserDaoImpl();
			
			AppUser appUser = new AppUser();
			appUser.setEmail("naresh.a@gmail.com");
			appUser.setUsername("naresh");
			
			AppUserDTO regUser = appUserDao.registerUser(appUser);
			
			ContactDao obj = new ContactDaoImpl();
			
			
		}
}
