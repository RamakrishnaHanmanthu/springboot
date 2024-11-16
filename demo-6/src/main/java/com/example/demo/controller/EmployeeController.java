package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/post")
	public Employee post(@RequestBody Employee e1 ) {
		
		return employeeRepository.save(e1);
	}
	
	@GetMapping
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/get/{name}")
	public Optional<Employee> getById(@PathVariable String name){
		return employeeRepository.findById(name);
	}

}