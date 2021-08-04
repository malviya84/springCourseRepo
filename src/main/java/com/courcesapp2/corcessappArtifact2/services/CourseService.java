package com.courcesapp2.corcessappArtifact2.services;

import com.courcesapp2.corcessappArtifact2.entities.Course;

import java.util.List;

public interface CourseService {


    public List<Course> getCourses();
    public Course getCourse(long courseId);

    public Course addCourse(Course course);


    Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
