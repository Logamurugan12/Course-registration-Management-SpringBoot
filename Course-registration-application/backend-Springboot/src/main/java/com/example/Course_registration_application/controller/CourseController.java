package com.example.Course_registration_application.controller;

import com.example.Course_registration_application.model.CourseRegistry;
import com.example.Course_registration_application.model.Courses;
import com.example.Course_registration_application.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Courses> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudent(){
        return courseService.enrolledStudents();
    }
    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! "+ name +" Enrollment Successful for "+ courseName;

    }
}
