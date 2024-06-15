package com.example.Lab12.Rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Lab12.model.Employee;

public interface EmployeeRep extends JpaRepository <Employee,Long> {

}
