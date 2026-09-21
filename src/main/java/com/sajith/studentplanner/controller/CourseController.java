package com.sajith.studentplanner.controller;

import com.sajith.studentplanner.model.Course;
import com.sajith.studentplanner.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getCourse() {
        return courseRepository.findAll();
    }
    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        courseRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public Course update(@PathVariable Long id,@RequestBody Course updateCourse){
        Course c=courseRepository.findById(id).orElseThrow();
        c.setName(updateCourse.getName());
        c.setProfessor(updateCourse.getProfessor());
        return courseRepository.save(c);
    }
}
