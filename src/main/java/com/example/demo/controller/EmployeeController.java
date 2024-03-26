package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.get();	
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id){
		return employeeService.get(id);	
	}
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.delete(id);
		return "Employee deleted with Id"+id;
	}
	
	@PutMapping("/employee")
	public Employee updateEmploye(@RequestBody Employee employee) {
		return employeeService.update(employee);
	}
}
