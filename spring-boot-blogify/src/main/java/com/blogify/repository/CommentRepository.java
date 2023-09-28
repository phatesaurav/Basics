package com.blogify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogify.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
