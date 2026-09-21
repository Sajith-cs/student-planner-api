package com.sajith.studentplanner.controller;

import com.sajith.studentplanner.model.Course;
import com.sajith.studentplanner.model.Deadline;
import com.sajith.studentplanner.repository.CourseRepository;
import com.sajith.studentplanner.repository.DeadlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deadlines")
public class DeadlineController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DeadlineRepository deadlineRepository;
    @GetMapping
    public List<Deadline> getDeadline() {
        return deadlineRepository.findAll();
    }
    @PostMapping
    public Deadline addDeadline(@RequestBody Deadline deadline,@RequestParam Long courseId){
        deadline.setCourse(courseRepository.findById(courseId).orElseThrow());
        return deadlineRepository.save(deadline);
    }
    @PutMapping("/{id}/complete")
    public Deadline markComplete(@PathVariable Long id){
        Deadline c=deadlineRepository.findById(id).orElseThrow();
        c.setCompleted(true);
        return deadlineRepository.save(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        deadlineRepository.deleteById(id);
    }
}
