package com.userregistration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userregistration.model.User;
import com.userregistration.repository.SignupRepo;

@RestController
public class SignupController {
	@Autowired
	SignupRepo repo;
	
	public SignupController(SignupRepo repo) {
		this.repo = repo;
	}
	
	@GetMapping("/register")
	public String sendForm(Model model) {
		model.addAttribute("userForm", new User());
		return "addUser";
	}
	
	@PostMapping("/register")
	public String storeForm(@ModelAttribute("userForm") Model model) {
		
		return "showMessage";
	}
	/*@RequestMapping(value = "/signup", method=RequestMethod.GET)
	public String getUser() {
		
		return "signup";
	}
	
	static private List<User> list = new ArrayList<>();
	
	static{
		User u1 = new User("John", "Keppler","Male","jk@gmail.com","JohnKeppler","JK#123");
		User u2 = new User("Christine", "Wood","Female","cw@gmail.com","CristineWood","CW#8466@");
		
		list.add(u1);
		list.add(u2);
	}
	
	@GetMapping("/signup")
	public List<User> giveList(){
		
		repo.saveAll(list);
		return list;
	}*/
	
}
