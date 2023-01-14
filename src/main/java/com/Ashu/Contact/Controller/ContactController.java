package com.Ashu.Contact.Controller;




import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ashu.Contact.Constant.AppConstant;
import com.Ashu.Contact.Entity.Contact;
import com.Ashu.Contact.Service.ContactServiceI;
import com.Ashu.Contact.props.AppProps;

@Controller

public class ContactController {
	
	@Autowired
	private ContactServiceI contactServiceI;
	
	@Autowired
	private AppProps appProps;
	
	@GetMapping("/Contact")
	public String loadingform(Model model) {
		
		Contact contact = new Contact();
		
		model.addAttribute("contact", contact);
		
		return AppConstant.CONTACTINFO;
		
		}
	
	@PostMapping("/saveContact")
	public String saveContact(Contact contact,Model model)
	{
		boolean save = contactServiceI.SaveContact(contact);
		Map<String,String> messages = appProps.getMessagesMap();
		
		if(save) {
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_SUCCESS));
		}
		else {
			model.addAttribute(AppConstant.FAIL, messages.get(AppConstant.SAVE_FAIL));
		}
		return AppConstant.CONTACTINFO;
		
	}
	
	@GetMapping("/ViewContact")
	public String viewAllContact(Model model) {
		
		List<Contact> allContact = contactServiceI.getAllContact();
		
		model.addAttribute(AppConstant.CONTACT, allContact);
		
		return AppConstant.CONTACT;
	}
	
	
}
