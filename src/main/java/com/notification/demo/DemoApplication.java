package com.notification.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	var userService  = 	context.getBean(UserService.class);
userService.registerUser(new User(1L, "Ritik Kumar","ritikkumarkashyap9@gmail.com" , "Ritik@123"));
userService.registerUser(new User(2L, "Arun Kumar","arunkashyap9@gmail.com" , "Arun@123"));
//userService.registerUser(new User(2L, "Arun Kumar","arunkashyap9@gmail.com" , "Arun@123"));
	}

}
