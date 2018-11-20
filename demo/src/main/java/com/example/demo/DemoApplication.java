package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("test");
		int b=0;
		SpringApplication.run(DemoApplication.class, args);
	}
}
