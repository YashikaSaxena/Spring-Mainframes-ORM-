package com.ncu.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.Model.UserLogin;




@Controller
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping("/register")
	public String userRegistration(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "register";
	}
	
	@RequestMapping("/login")
	public String userLogin(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "login";
	}
	@RequestMapping(path = "/view",method = RequestMethod.POST)
	public String displayWelcome(@ModelAttribute ("UserModel") UserLogin user, Model model ) {
		
		model.addAttribute("Email", user.getEmail());
		model.addAttribute("Password", user.getPassword());
		;
		model.addAttribute("Name", user.getUsername());
	
		return "view";
	}
}
