package com.example.one.demo_one;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOneApplication implements CommandLineRunner {
	ProdDB prodDB;

	public static void main(String[] args) {
		SpringApplication.run(DemoOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		prodDB = new ProdDB();
		System.out.println(prodDB.getData());

	}

}
