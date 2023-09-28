package com.jwt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.entity.User;

@Service
public class UserService {
	
	List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(1, "Saurav", "phatesaurav@gmail.com", "5498", "I'm Saurav."));
		users.add(new User(2, "Anurag", "anuragphate@gmail.com", "Annu", "I'm Anurag."));
	}
	
	public List<User> getUsers(){
		return users;
	}
}
