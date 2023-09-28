package com.blogify.service;

import java.util.List;

import com.blogify.dto.PostDto;
import com.blogify.dto.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer categoryId, Integer UserId);

	List<PostDto> getAllPosts(Integer pageSize, Integer pageNumber);
	
	PostResponse getAllPostResponses(Integer pageSize, Integer pageNumber, String sortBy, String sortDirection);

	PostDto getPostById(Integer postId);

	PostDto updatePost(PostDto postDto, Integer postId);

	void deletePost(Integer postId);

	List<PostDto> getPostsByCategory(Integer categoryId);
	
	PostResponse getPostResponsesByCategory(Integer categoryId, Integer pageSize, Integer pageNumber);

	List<PostDto> getPostsByUser(Integer userId);
	
	PostResponse getPostResponsesByUser(Integer userId, Integer pageSize, Integer pageNumber);

	List<PostDto> searchPostsByTitle(String title);
	
	List<PostDto> searchPostsByContent(String content);
	
	List<PostDto> searchPostsByKeyword(String keyword);
}
