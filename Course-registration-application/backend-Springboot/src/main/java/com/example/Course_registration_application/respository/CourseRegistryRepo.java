package com.example.Course_registration_application.respository;

import com.example.Course_registration_application.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
