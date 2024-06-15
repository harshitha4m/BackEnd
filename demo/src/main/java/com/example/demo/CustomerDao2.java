package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao2 extends JpaRepository<Customer, Integer> {

}