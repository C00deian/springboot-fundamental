package com.notification.demo;

import com.notification.demo.entities.User;
import com.notification.demo.repositories.UserRepository;
import com.notification.demo.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		var userService = context.getBean(UserService.class);

		userService.updateProductByCategory();
	}

}
