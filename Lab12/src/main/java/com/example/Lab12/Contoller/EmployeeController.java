package com.example.Lab12.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Lab12.Rep.EmployeeRep;
import com.example.Lab12.model.Employee;

@RestController
@RequestMapping("/myEmployees/v1.0")
public class EmployeeController {
	@Autowired
	EmployeeRep employeeRep;
	@GetMapping ("/allEmployees")
	public List<Employee> getAllEmployees(){
		List<Employee> le =employeeRep.findAll();
		return le;
	
		
	}
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee )
	{
		return employeeRep.save(employee);
		
		
	}
	//@UpdateMapping("/newEmployee")
	@PostMapping("/addEmployeeList")
	public List<Employee> addEmployeeList(@RequestBody List<Employee> employees) {
		return  employeeRep.saveAll(employees);
	}
	@DeleteMapping(value="/deleteEmployee/id/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeRep.deleteById(id);
		//return (Employee) employeeRep.deleteById(id);
		//return new Employee();
	}
}

