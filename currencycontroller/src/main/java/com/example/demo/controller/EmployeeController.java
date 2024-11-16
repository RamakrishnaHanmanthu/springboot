package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return empService.save(employee);
	}
	
	@GetMapping
	public Employee getEmployee(@RequestParam Long id) {
		return empService.find(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return empService.getAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		empService.delete(id);
	}
	
}