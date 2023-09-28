package com.blogify.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Name must be at least 4 characters long")
	private String name;

	@Email(regexp = "^[A-Za-z0-9+_.-]+@gmail.com$", message = "Email must be a Gmail address")
	@NotEmpty
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be between 3 and 10 characters long")
	private String password;

	@NotEmpty
	private String about;
}
