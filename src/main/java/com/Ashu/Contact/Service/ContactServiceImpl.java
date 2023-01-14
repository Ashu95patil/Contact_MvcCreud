package com.Ashu.Contact.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ashu.Contact.Constant.AppConstant;
import com.Ashu.Contact.Entity.Contact;
import com.Ashu.Contact.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean SaveContact(Contact contact) {
	
		contact.setIsactive(AppConstant.YES);
		Contact save = this.contactRepository.save(contact);
		
		if(save != null && save.getContactid() !=null)
		{
			System.out.println(save);
		return true; 
	}
     return false;
}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepository.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(Integer contactid) {
		
		//using Or else throw
		
//		Contact orElseThrow = contactRepository.findById(contactid).orElseThrow();
//		return orElseThrow;
		
		Optional<Contact> findById = contactRepository.findById(contactid);
		if(findById.isPresent()) {
			
			return findById.get();
		}else {
		return null;
		}
		
		
		
	}

	@Override
	public boolean deleteContactById(Integer contactid) {
		
		// using Or else Throw
		
//		Contact orElseThrow = contactRepository.findById(contactid).orElseThrow();
//		if(orElseThrow != null) {
//		return true;
//	}else {
//		return false;
//	}
		
		Optional<Contact> findById = contactRepository.findById(contactid);
		
		if(findById.isPresent()) {
			Contact contact = findById.get();
			contactRepository.delete(contact);
			return true;
		}else {
			return false;
		}
	}
}