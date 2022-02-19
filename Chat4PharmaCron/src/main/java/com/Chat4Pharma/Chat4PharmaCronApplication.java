package com.Chat4Pharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Chat4PharmaCronApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chat4PharmaCronApplication.class, args);
	}

}
