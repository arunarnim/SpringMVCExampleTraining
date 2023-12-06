package com.org.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NameController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getHome(Model model) {
		Employee home = new Employee();
		model.addAttribute("home", home);
		return "home";

	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String user(Employee user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("name", user.getName());
		model.addAttribute("job", user.getJob());
		System.out.println("------------User Page Requested" + user.getName());
		return "user";
		
	}
	
}
