package com.blog.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty(message = "Name must not be empty")
	@Size(min = 4, message = "Name must be at least 4 characters long")
	private String name;

	@NotEmpty(message = "Email must not be empty")
	@Email(regexp = "^[A-Za-z0-9+_.-]+@gmail.com$", message = "Email must be a Gmail address")
	private String email;

	@NotEmpty(message = "Password must not be empty")
	@Size(min = 3, max = 10, message = "Password must be between 3 and 10 characters long")
	private String password;

	@NotEmpty(message = "About must not be empty")
	private String about;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore // Exclude the 'posts' property from serialization // Avoid program from going into infinite loop while creating 'Post'
	List<Post> posts = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Comment> comments = new ArrayList<>();

}
