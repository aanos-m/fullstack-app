package com.aanos.backend;

import com.aanos.backend.entity.Customer;
import com.aanos.backend.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args); 
	}
	@Bean
	CommandLineRunner initDatabase(CustomerRepository customerRepository) {
		return args -> {
			// Prepopulate the database with customer entries
			customerRepository.save(new Customer("", "John Doe", "john@example.com", "test addy"));
			customerRepository.save(new Customer("","Jane Smith", "jane@example.com", "test addy"));
			customerRepository.save(new Customer("","Alice Johnson", "alice@example.com", "test addy"));
		};
	}
}
