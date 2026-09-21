package com.sajith.studentplanner.repository;

import com.sajith.studentplanner.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
