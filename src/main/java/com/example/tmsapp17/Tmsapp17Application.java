package com.example.tmsapp17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tmsapp17Application {

@GetMapping
	public String message(){
		return"it is connected 17";
	}

	public static void main(String[] args) {
		SpringApplication.run(Tmsapp17Application.class, args);
	}

}
