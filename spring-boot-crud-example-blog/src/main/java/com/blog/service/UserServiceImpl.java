package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.exception.ResourceNotFoundException;
import com.blog.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public User getUserById(int id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", id));
	}

	@Override
	public User updateUser(User user, int id) {
		User existingUser = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", id));
		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		existingUser.setAbout(user.getAbout());
		return repository.save(existingUser);
	}

	@Override
	public void deleteUser(int id) {
		User existingUser = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", id));
		repository.delete(existingUser);
	}

}
