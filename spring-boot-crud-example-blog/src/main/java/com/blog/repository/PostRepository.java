package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.Category;
import com.blog.entity.Post;
import com.blog.entity.User;

public interface PostRepository extends JpaRepository<Post, Integer> {

	List<Post> findByCategory(Category category); // Custom finder method

	List<Post> findByUser(User user); // Custom finder method
	
	List<Post> findByTitleContaining(String postTitle);
	
	List<Post> findByContentContaining(String postContent);
}
