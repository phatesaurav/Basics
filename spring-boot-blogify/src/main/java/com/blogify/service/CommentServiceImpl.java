package com.blogify.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogify.dto.CommentDto;
import com.blogify.entity.Comment;
import com.blogify.entity.Post;
import com.blogify.entity.User;
import com.blogify.exception.ResourceNotFoundException;
import com.blogify.repository.CommentRepository;
import com.blogify.repository.PostRepository;
import com.blogify.repository.UserRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId, Integer userId) {
		Post post = postRepository.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", postId));
		User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", userId));
		Comment comment = dtoToComment(commentDto);
		comment.setPost(post);
		comment.setUser(user);
		Comment savedComment = commentRepository.save(comment);
		return commentToDto(savedComment);
	}

	@Override
	public void deleteComment(Integer CommentId) {
		Comment comment = commentRepository.findById(CommentId).orElseThrow(()-> new ResourceNotFoundException("Comment", CommentId));
		commentRepository.delete(comment);

	}
	
	private Comment dtoToComment(CommentDto commentDto) {
		Comment comment = modelMapper.map(commentDto, Comment.class);
		return comment;
	}
	
	private CommentDto commentToDto(Comment comment) {
		CommentDto commentDto = modelMapper.map(comment, CommentDto.class);
		return commentDto;
	}
}
