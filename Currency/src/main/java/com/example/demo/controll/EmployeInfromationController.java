package com.example.demo.controll;

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

import com.example.demo.entity.EmployeeInformation;
import com.example.demo.service.EmployeInformationService;

@RestController
@RequestMapping("/emp")
public class EmployeInfromationController {

	@Autowired
	private EmployeInformationService employeeinformationservice;

	@GetMapping("/all")
	public List<EmployeeInformation> getAll() {
		return employeeinformationservice.getAll();

	}

	@GetMapping("/{id}")
	public Optional<EmployeeInformation> get(@PathVariable Long id) {
		return employeeinformationservice.get(id);
	}

	@PostMapping
	public EmployeeInformation saveOrUpdate(@RequestBody EmployeeInformation emp) {
		return employeeinformationservice.saveOrUpdate(emp);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		employeeinformationservice.delete(id);
	}

}
