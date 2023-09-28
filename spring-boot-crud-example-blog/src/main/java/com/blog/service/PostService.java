package com.blog.service;

import java.util.List;

import com.blog.entity.Post;

public interface PostService {

	Post createPost(Post post, int categoryId, int userId);

	List<Post> getAllPosts();
	
	List<Post> getAllPosts(int pageNumber, int pageSize);
	
	List<Post> getAllPosts(int pageNumber, int pageSize, String sortBy);
	
	List<Post> getAllPosts(int pageNumber, int pageSize, String sortBy, String sortDirection);

	Post getPostById(int postId);

	Post updatePost(Post post, int postId);

	void deletePost(int postId);

	List<Post> getPostsByCategory(int categoryId);

	List<Post> getPostsByUser(int userId);

	List<Post> searchPostsByKeyword(String keyword);
	
	List<Post> searchPostsByTitleContaining(String postTitle);
	
	List<Post> searchPostsByContentContaining(String postContent);
}
