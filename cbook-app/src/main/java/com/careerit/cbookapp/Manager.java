package com.careerit.cbookapp;

import java.time.LocalDate;
import java.util.List;

import com.careerit.cbookapp.dao.AppUserDao;
import com.careerit.cbookapp.dao.AppUserDaoImpl;
import com.careerit.cbookapp.dao.ContactDao;
import com.careerit.cbookapp.dao.ContactDaoImpl;
import com.careerit.cbookapp.domain.AppUser;
import com.careerit.cbookapp.dto.AppUserDTO;
import com.careerit.cbookapp.dto.ContactDTO;
import com.careerit.cbookapp.excpetion.BadCredentialsException;
import com.careerit.cbookapp.excpetion.UserAlreadyExistsException;
import com.careerit.cbookapp.excpetion.UserNotFoundException;

public class Manager {

	
		public static void main(String[] args) throws UserAlreadyExistsException {
			
			
			AppUserDao appUserDao = new AppUserDaoImpl();
			ContactDao contactDao = new ContactDaoImpl();
//			AppUser appUser = new AppUser();
//			appUser.setEmail("jayesh@gmail.com");
//			appUser.setUsername("Jayesh");
//			appUser.setPassword("jayesh@abc.com");
//			
//			AppUserDTO regUser = appUserDao.registerUser(appUser);
//			
//			System.out.println(regUser.getUsername());
//			System.out.println(regUser.getEmail());
			
			try {
				AppUserDTO retObj = appUserDao.login("naresh.a@gmail.com", "user@123");
				
				ContactDTO obj = new ContactDTO();
				obj.setName("John");
				obj.setMobile("877643299");
				obj.setEmail("john@gmail.com");
				obj.setDob(LocalDate.of(1984, 8,21));
				obj.setUid(retObj.getUid());
				
				obj = contactDao.addContact(obj);
				System.out.println(obj.getCid() + "with id contact is added");
//				List<ContactDTO> list = contactDao.getContacts(retObj.getUid());
//				list.stream().forEach(c->{
//						System.out.println(c.getName()+" "+c.getMobile());
//				});
			} catch (UserNotFoundException e) {
				e.printStackTrace();
			} catch (BadCredentialsException e) {
				e.printStackTrace();
			}
			
			
		}
}
