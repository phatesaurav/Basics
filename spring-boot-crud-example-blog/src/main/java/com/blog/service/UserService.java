package com.blog.service;

import java.util.List;

import com.blog.entity.User;

public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUsers();
	
	User getUserById(int id);
	
	User updateUser(User user, int id);
	
	void deleteUser(int id);
}
