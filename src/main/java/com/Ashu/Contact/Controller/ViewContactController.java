package com.Ashu.Contact.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;


import com.Ashu.Contact.Entity.Contact;
import com.Ashu.Contact.Service.ContactServiceI;

@Controller
public class ViewContactController {
	
	
	@Autowired
	private ContactServiceI contactServiceI;
	
	@GetMapping("/edit")
	public String editContact(@RequestParam("contactid") Integer contactid,Model model) {
		Contact contact = contactServiceI.getContactById(contactid);
		
		model.addAttribute("contact", contact);
		return "contactInfo";
	}
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("contactid") Integer contactid, Model model) {
		
		 contactServiceI.deleteContactById(contactid);
		return "redirect:ViewContact";
	}

}
