package com.codeclan.example.CourseBookingSystemLab.repository.CustomerRepository;

import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import com.codeclan.example.CourseBookingSystemLab.projections.CustomerEmbedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = CustomerEmbedding.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersByBookingsCourseId(Long courseid);
    List<Customer> findCustomersByTownAndBookingsCourseId(String town, Long courseid);
    List<Customer> findCustomersByAgeGreaterThanAndTownAndBookingsCourseName(int age, String town, String coursename);
}
