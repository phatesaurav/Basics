package com.blogify.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogify.dto.UserDto;
import com.blogify.entity.User;
import com.blogify.exception.ResourceNotFoundException;
import com.blogify.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	// Spring container will detect 'Bean' from 'SpringBootBlogifyApplication.java'
	// We can use this convert an object of one class to different class
	// Example, User object to UserDto object or vice-verse
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = dtoToUser(userDto);
		User savedUser = repository.save(user); // 'save' is JpaRepository method thus we need is pass entity type of
												// object
		return userToDto(savedUser);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = repository.findAll();
		List<UserDto> userDtos = new ArrayList<>();

		for (User user : users) {
			UserDto userDto = userToDto(user);
			userDtos.add(userDto);
		}
		return userDtos;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user = repository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		return userToDto(user);
	}
	
	@Override
	public UserDto getUserByEmail(String userEmail) {
		User user = repository.findByEmail(userEmail).orElseThrow(()-> new RuntimeException("User not found"));
		return userToDto(user);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user = repository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		User updatedUser = repository.save(user);
		return userToDto(updatedUser);
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = repository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
		repository.delete(user);
	}

	// dto is exposed to outer world
	// To send data from UserDto(outside) to User(inside database)
	// Converting UserDto object to User object
	private User dtoToUser(UserDto userDto) {

		// Old Implementation method before ModelMapper
//		User user = new User();
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAbout(userDto.getAbout());
//		return user;

		// New Implementation method with ModelMapper
		// Pass two arguments first source(which object to convert?) then destination(in
		// which Class object to convert?)
		User user = modelMapper.map(userDto, User.class);
		return user;
	}

	// To get data from User(inside database) to UserDto(outside)
	public UserDto userToDto(User user) {

		// Old Implementation method before ModelMapper
//		UserDto userDto = new UserDto();
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setAbout(user.getAbout());
//		return userDto;

		// New Implementation method with ModelMapper
		// Pass two arguments first source(which object to convert?) then destination(in
		// which Class object to convert?)
		UserDto userDto = modelMapper.map(user, UserDto.class);
		return userDto;
	}

}
