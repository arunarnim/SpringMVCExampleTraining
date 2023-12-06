package com.org.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/message")
	public String dispMsg(Model model) {
		model.addAttribute("message", "hello world");
		return "messageView";
	}
}
