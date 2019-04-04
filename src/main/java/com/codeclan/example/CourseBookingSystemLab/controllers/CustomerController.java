package com.codeclan.example.CourseBookingSystemLab.controllers;

import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import com.codeclan.example.CourseBookingSystemLab.repository.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/bybookingcourse/{courseid}")
    public List<Customer> findCustomersByBookingsCourseId(@PathVariable Long courseid){
        return customerRepository.findCustomersByBookingsCourseId(courseid);
    }

    @GetMapping(value = "/bytownandcourse/{town}/{courseid}")
    public List<Customer> findCustomersByTownAndBookingsCourseId(@PathVariable String town,@PathVariable Long courseid){
        return customerRepository.findCustomersByTownAndBookingsCourseId(town, courseid);
    }

    @GetMapping(value = "/agetowncourse/{age}/{town}/{coursename}")
    public List<Customer> findCustomersByAgeGreaterThanAndTownAndBookingsCourseName(@PathVariable int age,@PathVariable String town,@PathVariable String coursename){
        return customerRepository.findCustomersByAgeGreaterThanAndTownAndBookingsCourseName(age, town, coursename);
    }
}
