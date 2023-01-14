package com.Ashu.Contact.Service;

import java.util.List;

import com.Ashu.Contact.Entity.Contact;

public interface ContactServiceI {
	
	public boolean SaveContact(Contact contact);

	
	List<Contact> getAllContact();
	
	Contact getContactById(Integer contactid);
	
	public boolean deleteContactById(Integer contactid);
}
