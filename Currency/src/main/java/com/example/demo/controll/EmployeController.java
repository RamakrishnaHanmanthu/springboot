package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.DtoInstantiatingConverter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/country")
public class EmployeController {

	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/all")
	public List<Employee> getAll() {
		return employeeservice.getAll();

	}

	@GetMapping("/{id}")
	public Employee get(@PathVariable Long id) {
		
		return employeeservice.get(id);
//		return employeeservice.get(id).map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Employee saveOrUpdate(@RequestBody Employee emp) {
		return employeeservice.saveOrUpdate(emp);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		employeeservice.delete(id);
	}
	public DtoInstantiatingConverter getSalaryById() {
		return getSalaryById();
		
	}

}
