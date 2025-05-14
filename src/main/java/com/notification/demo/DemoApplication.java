package com.notification.demo;

import com.notification.demo.entities.User;
import com.notification.demo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		var repository = context.getBean(UserRepository.class);

		var user = User.builder()
				.name("Ritik")
				.email("Ritik9@gmail.com")
				.password("Ritik@12")
				.build();

		repository.findAll().forEach( u -> System.out.println(u.getEmail()));

	}


}
