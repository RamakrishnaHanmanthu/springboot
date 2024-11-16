package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hii ramakrishna");
		SpringApplication.run(DemoApplication.class, args);
	}
}

	@RestController
	class Controller {

		@GetMapping("/")
		public String test() {
			return "Spring boot is running";
		}

		@GetMapping("/1")
		public String test1() {

			return "Spring boot is running from 1st Window";
		}

	}


