package com.blogify.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogify.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);
}
