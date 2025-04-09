package com.example.blue.app.blue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile({"dev","prod"})
public class BlueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueApplication.class, args);
	}

}
