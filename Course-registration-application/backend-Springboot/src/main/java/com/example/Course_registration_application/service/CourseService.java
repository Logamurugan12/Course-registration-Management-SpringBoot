package com.example.Course_registration_application.service;

import com.example.Course_registration_application.model.CourseRegistry;
import com.example.Course_registration_application.model.Courses;
import com.example.Course_registration_application.respository.CourseRegistryRepo;
import com.example.Course_registration_application.respository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Courses> availableCourses(){
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
