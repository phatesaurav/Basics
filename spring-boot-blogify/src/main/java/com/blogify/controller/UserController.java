package com.blogify.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogify.dto.UserDto;
import com.blogify.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		return new ResponseEntity<>(service.createUser(userDto), HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping("userId/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer userId) {
		return new ResponseEntity<>(service.getUserById(userId), HttpStatus.OK);
	}
	
	@GetMapping("userEmail/{userEmail}")
	public ResponseEntity<UserDto> getUserByEmail(@PathVariable String userEmail){
		return new ResponseEntity<>(service.getUserByEmail(userEmail),HttpStatus.OK);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,
			@PathVariable("userId") Integer userId) {
		return new ResponseEntity<>(service.updateUser(userDto, userId), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		service.deleteUser(userId);
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName()+" "+principal.toString();
	}
}
