package com.blogify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails userDetails = User.builder().username("Saurav").password(passwordEncoder().encode("5498")).roles("ADMIN").build();
//		return new InMemoryUserDetailsManager(userDetails);
//	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public AuthenticationManager authenticationManager(AuthenticationConfiguration) {
//		return builder.getAuthenticationManager();
//	}
}
