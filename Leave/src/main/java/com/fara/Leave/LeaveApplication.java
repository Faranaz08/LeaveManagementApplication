package com.fara.Leave;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaveApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LeaveApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Server Started for Leave");
		
	}

}
