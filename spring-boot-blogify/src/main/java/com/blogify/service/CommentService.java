package com.blogify.service;

import com.blogify.dto.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId, Integer userId);
	
	void deleteComment(Integer CommentId);
}
