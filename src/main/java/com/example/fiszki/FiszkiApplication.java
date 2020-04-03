package com.example.fiszki;

import com.example.fiszki.controller.MainController;
import com.example.fiszki.repository.StudentRepository;
import com.example.fiszki.service.StudentService;
import com.example.fiszki.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.fiszki.controller"})
@EnableJpaRepositories(basePackages = {"com.example.fiszki.repository"})
@EntityScan(basePackages = {"com.example.fiszki.entity"})
public class FiszkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiszkiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	StudentService studentService(StudentRepository studentRepository) {
		return new StudentServiceImpl(studentRepository);
	}

	@Bean
	MainController mainController(StudentService studentService) {
		return new MainController(studentService);
	}
}

