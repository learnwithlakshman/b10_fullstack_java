package com.careerit.cbookapp.dao;

import java.util.List;

import com.careerit.cbookapp.domain.Contact;

public interface ContactDao {

	public Contact addContact(Contact contact);

	public Contact editContact(Long cid);

	public Contact deleteContact(Long cid);

	public List<Contact> getContacts(Long uid);

	public List<Contact> search(Long uid, String str);

}
