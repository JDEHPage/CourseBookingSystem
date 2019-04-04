package com.codeclan.example.CourseBookingSystemLab.projections;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "coursesWithEmbedding", types = Customer.class)
public interface CustomerEmbedding {
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
