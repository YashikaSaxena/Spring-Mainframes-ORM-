package com.ncu.controller;


import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ncu.jdbc.UserDao;
import com.ncu.model.ModelDemo;

@Controller
public class ControllerDemo {

	@Autowired
	private UserDao userdao;
	
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
	
	@RequestMapping(value="/add" , method=RequestMethod.GET)
	public String Add(Model model,@ModelAttribute("modeldemo")ModelDemo modeldemo)
	{
		try {
		userdao.add(modeldemo);
				
		}catch(Exception e) {System.out.println(e);};
		
		return "Pagetwo";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String Update(Model model,@ModelAttribute("modeldemo")ModelDemo modeldemo)
	{
		userdao.update(modeldemo);
		
		return "Pagefour";
	}
	@RequestMapping(value="/delete")
	public String delete(Model model,@ModelAttribute("modeldemo")ModelDemo modeldemo)
	{
		userdao.delete(modeldemo.getRollnumber());
		
		return "Pagethree";
	}
	@RequestMapping(value="/show")
	public String userinfo(Model model,@ModelAttribute("modeldemo") ModelDemo modeldemo)
	{
		ArrayList<ModelDemo> studentlist = (ArrayList<ModelDemo>) userdao.showall();
		System.out.println(studentlist);
		model.addAttribute("studentlist",studentlist);
		return "Pagefive";
	}
}
