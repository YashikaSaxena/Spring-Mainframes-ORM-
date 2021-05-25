package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/index")
	public String helloMsg() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String userLogin() {
		return "login";
	}
	
	/*@RequestMapping(path = "/home",method = RequestMethod.POST)		
	public String display(@RequestParam("username") String name,@RequestParam("pswd") String pass,Model m) {
		String message="username: "+ name+"    password: "+pass; 
		m.addAttribute("msg",message);
		return "welcome";
	}*/
	
	@RequestMapping("/home")
	
		public String userWelcome(HttpServletRequest req, Model m) {
		//Read the provided data
		String name= req.getParameter("username");
		String password= req.getParameter("pswd");
			String message="username: "+ name+"    password: "+password; 
			m.addAttribute("msg",message);
			return "welcome";
		
	}

	
/*	@RequestMapping("/home")
	public String welcomeUser(Model m) {
		m.addAttribute("msg");
		return "welcome";
	}*/
	
	
	/*@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "homepage");
		return "welcome";
	}*/

/*	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userId=request.getParameter("userId");
		model.addAttribute("msg", "kalra login"+userId);
		return "login";
	}*/
	
}
