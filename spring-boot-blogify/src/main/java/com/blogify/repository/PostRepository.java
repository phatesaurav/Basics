package com.blogify.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blogify.entity.Category;
import com.blogify.entity.Post;
import com.blogify.entity.User;

public interface PostRepository extends JpaRepository<Post, Integer> {

	List<Post> findByCategory(Category category); // Custom finder method

	List<Post> findByUser(User user); // Custom finder method

	Page<Post> findByCategory(Category category, Pageable pageable); // Custom method for paginated results by category

	Page<Post> findByUser(User user, Pageable pageable);
	
	List<Post> findByTitleContaining(String title);
	
	List<Post> findByContentContaining(String content);
}
