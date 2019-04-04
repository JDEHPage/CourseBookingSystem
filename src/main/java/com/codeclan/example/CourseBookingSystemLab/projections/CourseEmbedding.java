package com.codeclan.example.CourseBookingSystemLab.projections;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "coursesWithEmbedding", types = Course.class)
public interface CourseEmbedding {
    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
