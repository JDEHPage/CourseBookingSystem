package com.codeclan.example.CourseBookingSystemLab.projections;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.models.Course;
import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "bookingWithEmbedding", types = Booking.class)
public interface BookingEmbedding {
    String getDate();
    Customer getCustomer();
    Course getCourse();
}
