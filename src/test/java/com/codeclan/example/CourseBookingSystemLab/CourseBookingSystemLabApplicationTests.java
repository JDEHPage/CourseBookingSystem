package com.codeclan.example.CourseBookingSystemLab;

import com.codeclan.example.CourseBookingSystemLab.models.Customer;
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
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void name() {
		Customer customer = new Customer("John", "Witbank", 23);
		customerRepository.save(customer);
	}
}
