package com.fastcampus.study;

import java.time.LocalTime;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fastcampus.study.producer.Producer;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}
	
	// Kafka Producer
	@Bean
	public ApplicationRunner runner (Producer producer) {
		return t -> {
			
			producer.async("study02", "Sending message and Time is " + LocalTime.now());
			Thread.sleep(1000L);
			
		};
		
	}
	
}
