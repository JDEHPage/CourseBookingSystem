package com.codeclan.example.CourseBookingSystemLab;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.models.Course;
import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import com.codeclan.example.CourseBookingSystemLab.repository.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookingSystemLab.repository.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookingSystemLab.repository.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemLabApplicationTests {
	
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void contextLoads() {
	}


	@Test
	public void canCreateBookingAndCustomerAndCourse() {
		Customer customer = new Customer("John", "Witbank", 23);
		customerRepository.save(customer);
		Course course = new Course("How to do stuff", "Kensington", 4);
		courseRepository.save(course);
		Booking booking = new Booking("22/03/18", customer, course);
		bookingRepository.save(booking);
	}

}
