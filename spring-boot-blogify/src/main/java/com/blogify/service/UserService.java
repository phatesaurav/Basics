package com.blogify.service;

import java.util.List;

import com.blogify.dto.UserDto;

public interface UserService {

	UserDto createUser(UserDto userDto);

	List<UserDto> getAllUsers();

	UserDto getUserById(Integer userId);
	
	UserDto getUserByEmail(String userEmail);

	UserDto updateUser(UserDto userDto, Integer userId);

	void deleteUser(Integer userId);
}
