package com.Ashu.Contact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ashu.Contact.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	

}
