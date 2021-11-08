package com.careerit.cbookapp.dao;

import java.util.List;

import com.careerit.cbookapp.dto.ContactDTO;

public interface ContactDao {

	public ContactDTO addContact(ContactDTO contact);

	public ContactDTO editContact(Long cid);

	public ContactDTO deleteContact(Long cid);

	public List<ContactDTO> getContacts(Long uid);

	public List<ContactDTO> search(Long uid, String str);

}
