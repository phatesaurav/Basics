package com.blogify.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String content;
	private String image;
	private Date date;

	@ManyToOne
//	@JoinColumn(name = "category_id") just to rename the column
	private Category category; // Many 'Post' can have one 'category'

	@ManyToOne
	private User user; // Many 'Post' can have one 'user'
	
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // foreign key will be created in 'Comment' table
	private List<Comment> comments; // One 'Post' will have multiple 'comment'
}
