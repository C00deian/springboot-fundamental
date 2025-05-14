package com.notification.demo;

import com.notification.demo.entities.Address;
import com.notification.demo.entities.Tag;
import com.notification.demo.entities.User;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	SpringApplication.run(DemoApplication.class, args);

	var user = User.builder()
		.name("John")
		.password("password")
		.email("john9@gmail.com")
		.build();

	user.addTag("tag1");
		System.out.println(user);


	}


}
