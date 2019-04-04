package com.codeclan.example.CourseBookingSystemLab.controllers;

import com.codeclan.example.CourseBookingSystemLab.models.Course;
import com.codeclan.example.CourseBookingSystemLab.repository.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/byrating/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/bycustomer/{courseid}")
    public List<Course> findCoursesByBookingsCustomerId(@PathVariable Long courseid){
        return courseRepository.findCoursesByBookingsCustomerId(courseid);
    }
}
