package com.blog.service;

import com.blog.entity.Comment;

public interface CommentService {
	
	Comment createComment(Comment comment, int postId, int userId);
	
	void deleteComment(int commentId);
}
