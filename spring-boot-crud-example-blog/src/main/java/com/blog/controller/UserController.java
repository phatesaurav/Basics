package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.User;
import com.blog.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/")
	public User createUser(@Valid @RequestBody User user) {
		return service.createUser(user);
	}

	@GetMapping("/")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@PutMapping("/{id}")
	public User updateUser(@Valid @RequestBody User user, @PathVariable int id) {
		return service.updateUser(user, id);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
}
