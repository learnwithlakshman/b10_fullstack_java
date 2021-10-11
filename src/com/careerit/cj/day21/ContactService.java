package com.careerit.cj.day21;

import java.util.List;

public interface ContactService {

		public Contact addContact(Contact contact);
		public Contact editContact(Long id);
		public List<Contact> search(String str);
		public List<Contact> allContacts();
		public boolean addContact(Long id);
		public Contact updateContact(Contact contact);
		
}
