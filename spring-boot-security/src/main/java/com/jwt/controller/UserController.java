package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/getCurrentUser")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
