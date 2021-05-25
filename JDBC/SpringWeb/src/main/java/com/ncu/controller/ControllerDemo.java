package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.models.Users;

@Controller
public class ControllerDemo {

	@RequestMapping("/start")
	public String welcomemsg(Model model,@ModelAttribute("user") Users user) {
		model.addAttribute("msg",new Users());
		return "FirstPage";
	}
	
	@RequestMapping(path = "/signup",method = RequestMethod.POST)
	public String HelloSignup(@ModelAttribute("user") Users user , Model model) {
		
		model.addAttribute("name",user.getName());
		model.addAttribute("age",user.getAge());
		model.addAttribute("email",user.getEmail());
		model.addAttribute("phoneno",user.getPhoneNo());
		model.addAttribute("password",user.getPassword());
		
		return "secondpage";
	}
}
