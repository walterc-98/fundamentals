package com.pluralsight.fundamentals;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("Hello pluralsight...\n");
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository applicationRepository){
		return (args) -> {
			applicationRepository.save(new Application("Trackzilla","kesha.williams","Application for tracking bugs."));
			applicationRepository.save(new Application("Expenses","mary.jones","Application to track expense reports."));
			applicationRepository.save(new Application("Notifications","karen.kane","Application to send alerts and notifications to users."));

			for (Application application : applicationRepository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
    }

}
