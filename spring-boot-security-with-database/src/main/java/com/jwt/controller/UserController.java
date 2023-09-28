package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.JwtRequest;
import com.jwt.entity.JwtResponse;
import com.jwt.entity.User;
import com.jwt.security.JwtHelper;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtHelper jwtHelper;

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest jwtRequest) {
		this.doAuthenticate(jwtRequest.getEmail(), jwtRequest.getPassword());
		UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getEmail());
		String token = this.jwtHelper.generateToken(userDetails);
		JwtResponse response = JwtResponse.builder().jwtToken(token).username(userDetails.getUsername()).build();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	private void doAuthenticate(String email, String password) {
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
		try {
			authenticationManager.authenticate(authentication);
		} catch (BadCredentialsException e) {
			throw new BadCredentialsException("Invalid Username or Password");
		}
	}

	@ExceptionHandler(BadCredentialsException.class)
	public String exceptionHandler() {
		return "Invalid Credentials";
	}
	
	

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/getCurrentUser")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
