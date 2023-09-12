package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> { // <Entity, data type of primary key>

}
