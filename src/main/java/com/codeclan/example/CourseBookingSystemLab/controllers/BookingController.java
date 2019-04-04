package com.codeclan.example.CourseBookingSystemLab.controllers;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.repository.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/bydate/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date){
        return bookingRepository.findBookingsByDate(date);
    }
}
