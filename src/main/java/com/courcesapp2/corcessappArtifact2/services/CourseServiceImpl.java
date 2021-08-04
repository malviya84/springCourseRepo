package com.courcesapp2.corcessappArtifact2.services;

import com.courcesapp2.corcessappArtifact2.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1,"First Course Title","1st Course Description"));
        list.add(new Course(2,"Second Course Title","2st Course Description"));
        list.add(new Course(3,"Third Course Title","3st Course Description"));


    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c =null;
        for (Course course :list ) {
            if(course.getId()==courseId) {
                c = course;
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
    public Course updateCourse(Course course) {

        list.forEach(e->{
            if(e.getId()== course.getId())
            {
                e.setTitle(course.getTitle());
                e.setDiscription(course.getDiscription());
            }
        });

        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }


}
