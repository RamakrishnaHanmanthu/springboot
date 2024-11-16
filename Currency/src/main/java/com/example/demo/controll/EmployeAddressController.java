package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeAddress;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeAddressService;

@RestController
@RequestMapping("/add")
public class EmployeAddressController {
	
	@Autowired
	private EmployeAddressService employeaddressservice;

	@GetMapping("/all")
	public List<EmployeAddress> getAll() {
		return employeaddressservice.getAll();

	}

	@PostMapping
	public EmployeAddress saveOrUpdate(@RequestBody Employee emp) {
		return employeaddressservice.saveOrUpdate(emp);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		employeaddressservice.delete(id);
	}

}
