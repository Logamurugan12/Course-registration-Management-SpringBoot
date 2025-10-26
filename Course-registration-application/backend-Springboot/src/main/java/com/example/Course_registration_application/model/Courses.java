package com.example.Course_registration_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Courses {
    @Id
    private int courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public Courses(int courseId, String courseName, String trainer, int durationInWeeks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainer = trainer;
        this.durationInWeeks = durationInWeeks;
    }
    public Courses(){

    }
}
