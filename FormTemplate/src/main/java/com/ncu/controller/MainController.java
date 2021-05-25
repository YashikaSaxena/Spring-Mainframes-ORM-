package com.ncu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.model.User;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String helloMsg() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String userInfo(Model model){
		model.addAttribute("UserModel", new User());
		return "info";
	}
	
	/*@RequestMapping(path="/details", method = RequestMethod.POST)
	public String display(@ Valid @ModelAttribute ("UserModel") User user, BindingResult br) {
        
        if (br.hasErrors()) {  
            return "info";  
        }  
        else {  
            return "viewInfo";  
        }  
	}  
	 
	*/
	@ModelAttribute("skillsList")
	public List<String> selectSkills(){
		List<String> skillsList=new ArrayList<String>();
		skillsList.add("Java");
		skillsList.add("C/C++");
		skillsList.add("Python");
		skillsList.add("HTML/CSS");
		skillsList.add("React");
		skillsList.add("JavaScript");
		return skillsList;
		
	}
	@ModelAttribute("countryList")
	public List<String> selectCountry(){
		List<String> countryList=new ArrayList<String>();
		countryList.add("India");
		countryList.add("United States");
		countryList.add("Australia");
		countryList.add("United Kingdom");
		countryList.add("Afghanistan");
		countryList.add("Singapore");
		return countryList;
		
	}
	
	@RequestMapping(path="/details", method = RequestMethod.POST)
	public String display(@ModelAttribute ("UserModel") User user, Model model) {
		model.addAttribute("Name", user.getUsername());
		model.addAttribute("Email", user.getUseremail());
		model.addAttribute("Password", user.getPswd());
		model.addAttribute("Gender", user.getGender());
		model.addAttribute("DOB", user.getDob());
		model.addAttribute("Age", user.getAge());
		model.addAttribute("PhoneNumber", user.getPhno());
		model.addAttribute("Country", user.getCountry());
		model.addAttribute("State", user.getState());
		model.addAttribute("Address", user.getAdd());
		model.addAttribute("Institution", user.getInstitution());
		model.addAttribute("Course", user.getCourse());
		model.addAttribute("Skills", user.getSkills());
		return "viewInfo";
	}
 
}
