package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Course;
import com.springrest.service.CourseService;

// First request will come to the controller
// Rest - representation state transfer
@RestController
@CrossOrigin(origins = "http://localhost:3000") // Cross-Origin Resource Sharing (CORS) issue
public class CourseController {

	// Spring will create object of 'CourseServiceImpl' class
	// And inject into 'CourseService' i.e. dependency injection
	@Autowired
	private CourseService service;

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return service.getCourses();
	}

	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable long id) {
		return service.getCourse(id);
	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}

	@PutMapping("/courses/{id}") // Change the mapping to accept PUT requests with an ID parameter
	public Course updateCourse(@PathVariable long id, @RequestBody Course course) {
		Course existingCourse = service.getCourse(id);

		if (existingCourse == null) {
			// Handle the case where the course with the given ID is not found
			// You can return an appropriate response (e.g., 404 - Not Found)
			return null;
		}

		// Update the existing course with the new data
		existingCourse.setTitle(course.getTitle());
		existingCourse.setDescription(course.getDescription());

		return service.updateCourse(existingCourse);
	}

	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long id) {
		try {
			service.deleteCourse(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
