package com.learnspringboot.controller;

import com.learnspringboot.entity.Course;
import com.learnspringboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable String id){
        return this.courseService.getCourseById(Long.parseLong(id));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable String id){
        return this.courseService.updateCourse(course, Long.parseLong(id));
    }

    @DeleteMapping("courses/{id}")
    public Course deleteCourseById(@PathVariable String id){
        return this.courseService.deleteCourseById(Long.parseLong(id));
    }
}
