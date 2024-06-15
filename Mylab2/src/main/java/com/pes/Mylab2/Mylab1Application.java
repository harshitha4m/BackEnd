package com.pes.Mylab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Mylab1Application implements CommandLineRunner{
	@Autowired
	CustomerDao customerDao;
	@Autowired
	EmployeeDao employeeDao;
	

	public static void main(String[] args) {
		SpringApplication.run(Mylab1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee c= new Employee(1,"Anya","Mandya",6005726);
		employeeDao.save(c);
		System.out.println("lab1 Doen");
		
	}

}