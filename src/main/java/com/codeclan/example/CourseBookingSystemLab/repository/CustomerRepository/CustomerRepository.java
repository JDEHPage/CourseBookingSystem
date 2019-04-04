package com.codeclan.example.CourseBookingSystemLab.repository.CustomerRepository;

import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
