package com.learnspringboot.service;

import com.learnspringboot.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class CourseServiceImpl implements CourseService{

    private List<Course> list;


    public CourseServiceImpl(){

        this.list = new ArrayList<>();
        this.list.add(new Course(101, "core java course","This course contains basics of java programming"));
        this.list.add(new Course(201, "DSA course","This is DSA course"));

    }

    @Override
    public List<Course> getCourses() {
        return this.list;
    }

    @Override
    public Course getCourseById(long id) {
        Course c=null;
        for (Course course: list) {
            if(course.getCourseId()==id){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {

        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course, Long id) {

        ListIterator listIterator=list.listIterator();

        while(listIterator.hasNext()){
            Course exiCourse= (Course) listIterator.next();

            if(exiCourse.getCourseId()==course.getCourseId()){
                exiCourse.setCourseName(course.getCourseName());
                exiCourse.setCourseDescription(course.getCourseDescription());
                return course;
            }
        }
       // course id not found
        return null;
    }

    @Override
    public Course deleteCourseById(long id) {

        ListIterator listIterator=list.listIterator();

        Course exiCourse=null;

        while(listIterator.hasNext()){
            exiCourse= (Course) listIterator.next();

            if(exiCourse.getCourseId()==id){
                list.remove(exiCourse);
                break;
            }
        }

        return exiCourse;
    }
}
