package com.learnspringboot.service;

import com.learnspringboot.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourseById(long id);

    public Course addCourse(Course course);

    public Course updateCourse( Course course, Long id);

    public Course deleteCourseById(long id);
}
