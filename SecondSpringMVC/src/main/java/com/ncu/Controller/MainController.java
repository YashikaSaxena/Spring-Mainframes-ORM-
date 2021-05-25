package com.ncu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/hello")
	public String display(Model model){
		model.addAttribute("msg","hello user");
		return "welcome";
	}

}
