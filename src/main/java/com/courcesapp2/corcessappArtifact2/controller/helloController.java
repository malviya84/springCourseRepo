package com.courcesapp2.corcessappArtifact2.controller;

import com.courcesapp2.corcessappArtifact2.entities.Course;
import com.courcesapp2.corcessappArtifact2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class helloController {
    @Autowired
    private CourseService service;


    @RequestMapping("/")
    public String getHelloWorldMethod()
    {
        return "Hello World";
    }

    @GetMapping("/home")
    public String getMapping()
    {
        return "Hello World getMapping";
    }

    @GetMapping("/course")
    public List<Course> getCourses()
    {
          return this.service.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.service.getCourse(Long.parseLong(courseId));
    }
   // TO get all courses to trigger pipeline
    @PostMapping(path="/course",consumes = "application/json")
    public Course addCourse(@RequestBody Course course)
    {
         return this.service.addCourse(course);
    }

    //update course  using PUT request
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){return this.service.updateCourse(course);}

    //delete the course
    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus>   deleteCourse(@PathVariable String courseId)
    {
        try{
            this.service.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        }
        catch (Exception e)
        {return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);}

    }


}
