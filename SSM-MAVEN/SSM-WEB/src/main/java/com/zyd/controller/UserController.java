package com.zyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyd.pojo.User;
import com.zyd.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService ;
	
	@RequestMapping("/register.html")
	public String userRegister(User user){
		this.userService.addUser(user);
		return "/jsp/welcome";
	}

}
