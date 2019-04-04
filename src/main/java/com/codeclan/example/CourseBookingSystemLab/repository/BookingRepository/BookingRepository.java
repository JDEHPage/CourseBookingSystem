package com.codeclan.example.CourseBookingSystemLab.repository.BookingRepository;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.projections.BookingEmbedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = BookingEmbedding.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);

//    Get all bookings for a given date
}
