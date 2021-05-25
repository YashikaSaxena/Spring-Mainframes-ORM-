 package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.ncu.model.ModelDemo;

@Controller
@SessionAttributes("modeldemo")
public class ControllerDemo {
	


	@ModelAttribute("modeldemo")
	public ModelDemo Setupform()
	{
		return new ModelDemo();
	}
	@RequestMapping("/init")
	public String FirstPage(Model model,@ModelAttribute("modeldemo") ModelDemo modeldemo) {
		model.addAttribute("msg",new ModelDemo());
		return "Pageone";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String DoLogin(Model model,@ModelAttribute("modeldemo")ModelDemo modeldemo)
	{
		if(modeldemo.getEmail().equals("zaid19csu368@ncuindia.edu") && modeldemo.getPassword().equals("zaidkhan"))
		{
			
			System.out.println(modeldemo.getEmail());
			
			modeldemo.setFname("Zaid");
			modeldemo.setLname("Khan");
			modeldemo.setRollnumber("19CSU368");
		}
		else
		{
			model.addAttribute("message","Login Failed");
			return "Pageone";
		}
		return "Pagetwo";
	}
	
	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String userinfo(@SessionAttribute("modeldemo") ModelDemo modeldemo)
	{
		
		return "Pagethree";
	}
}
