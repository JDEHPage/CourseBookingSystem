package com.codeclan.example.CourseBookingSystemLab.repository.CourseRepository;

import com.codeclan.example.CourseBookingSystemLab.models.Course;
import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import com.codeclan.example.CourseBookingSystemLab.projections.CourseEmbedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = CourseEmbedding.class)
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByRating(int rating);
    List<Course> findCoursesByBookingsCustomerId(Long courseid);

}
