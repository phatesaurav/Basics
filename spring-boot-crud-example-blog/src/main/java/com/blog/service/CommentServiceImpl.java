package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Comment;
import com.blog.entity.Post;
import com.blog.entity.User;
import com.blog.exception.ResourceNotFoundException;
import com.blog.repository.CommentRepository;
import com.blog.repository.PostRepository;
import com.blog.repository.UserRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Comment createComment(Comment comment, int postId, int userId) {
		Post post = postRepository.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", postId));
		User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", userId));
		Comment newComment = new Comment();
		newComment.setContent(comment.getContent());
		newComment.setPost(post);
		newComment.setUser(user);
		return commentRepository.save(newComment);
	}

	@Override
	public void deleteComment(int commentId) {
		Comment comment = commentRepository.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", commentId));
		commentRepository.delete(comment);
	}

}
