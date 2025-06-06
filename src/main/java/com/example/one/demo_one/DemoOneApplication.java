package com.example.one.demo_one;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOneApplication implements CommandLineRunner {
	DB db;

	public static void main(String[] args) {
		SpringApplication.run(DemoOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");

		System.out.println(db.getData());

	}

}
