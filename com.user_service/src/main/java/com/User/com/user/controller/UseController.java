package com.User.com.user.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.User.com.user.Entity.User;
import com.User.com.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/user")
public class UseController {
	
	@Autowired
	private RestTemplate temp;
	
	@Autowired
	private UserService userServiceImpl;
		@GetMapping("/{User_id}")
		public User getUser (@PathVariable("User_id")Long user_id)
		{	
			User user = this.userServiceImpl.getUser(user_id);   
			
			List contact=this.temp.getForObject("http://localhost:9002/contact/user/"+user_id,List.class);
			
			
			user.setContacts(contact);
			return user;
			
		 
		}
	
	
	
	
	
}
  