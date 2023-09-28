package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Comment;
import com.blog.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentService service;
	
	@PostMapping("/postId/{postId}/userId/{userId}")
	public Comment createComment(@RequestBody Comment comment, @PathVariable int postId, @PathVariable int userId) {
		return service.createComment(comment, postId, userId);
	}
	
	@DeleteMapping("/commentId/{commentId}")
	public void deleteComment(@PathVariable int commentId) {
		service.deleteComment(commentId);
	}
}
