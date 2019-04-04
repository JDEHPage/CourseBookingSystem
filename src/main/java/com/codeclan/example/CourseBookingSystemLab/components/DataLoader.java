package com.codeclan.example.CourseBookingSystemLab.components;

import com.codeclan.example.CourseBookingSystemLab.models.Booking;
import com.codeclan.example.CourseBookingSystemLab.models.Course;
import com.codeclan.example.CourseBookingSystemLab.models.Customer;
import com.codeclan.example.CourseBookingSystemLab.repository.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookingSystemLab.repository.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookingSystemLab.repository.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("John", "Witbank", 23);
        customerRepository.save(customer1);

        Course course1 = new Course("How to do stuff", "Kensington", 4);
        courseRepository.save(course1);

        Booking booking1 = new Booking("22-03-18", customer1, course1);
        bookingRepository.save(booking1);




        Customer customer2 = new Customer("Brian", "Wavely", 31);
        customerRepository.save(customer2);

        Course course2 = new Course("How to Sleep Less", "WhiteSpring", 3);
        courseRepository.save(course2);

        Booking booking2 = new Booking("30-04-18", customer2, course2);
        bookingRepository.save(booking2);



        Customer customer3 = new Customer("Laura", "Etequeni", 27);
        customerRepository.save(customer3);

        Course course3 = new Course("Learning to Learn", "Bluemarch", 4);
        courseRepository.save(course3);

        Booking booking3 = new Booking("12-05-18", customer3, course3);
        bookingRepository.save(booking3);



        Customer customer4 = new Customer("Simone", "Riseling", 27);
        customerRepository.save(customer4);

        Booking booking4 = new Booking("22-04-18", customer4, course1);
        bookingRepository.save(booking4);
    }
}
