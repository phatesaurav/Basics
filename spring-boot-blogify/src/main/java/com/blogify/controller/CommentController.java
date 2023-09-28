package com.blogify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogify.dto.CommentDto;
import com.blogify.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/postId/{postId}/userId/{userId}")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId, @PathVariable Integer userId){
		return new ResponseEntity<>(commentService.createComment(commentDto, postId, userId),HttpStatus.CREATED);
	}
	
	@DeleteMapping("commentId/{commentId}")
	public void deleteComment(@PathVariable Integer commentId) {
		commentService.deleteComment(commentId);
	}
}
