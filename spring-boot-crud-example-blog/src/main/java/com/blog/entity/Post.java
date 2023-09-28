package com.blog.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotEmpty;
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

	@NotEmpty
	private String title;

	@NotEmpty
	private String content;

	private String image;
	private Date date;

	@ManyToOne
	private Category category;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // foreign key will be created in 'Comment' table
	@JsonManagedReference // To get 'comments' through 'Post' but now vice-versa is not possible // To keep circular references and still serialize it to JSON // 'Comment' have 'Post'
	private List<Comment> comments; // One 'Post' will have multiple 'comment'

	@Transient
	private int pagenumber;

	@Transient
	private int pagesize;

	@Transient
	private long totalElements;

	@Transient
	private long totalPages;

	@Transient
	private boolean isLastPage;
}
