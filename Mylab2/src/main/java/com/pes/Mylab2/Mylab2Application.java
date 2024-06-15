package com.pes.Mylab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Mylab2Application implements CommandLineRunner{
	@Autowired
	CustomerDao customerDao;
	

	public static void main(String[] args) {
		SpringApplication.run(Mylab2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c= new Customer(1,"Anya","anyaa3@gmail.com","Karnataka",6005726241l);
		customerDao.save(c);
		System.out.println("lab1 Doen");
	}

}