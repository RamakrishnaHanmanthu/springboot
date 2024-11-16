package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee put(Employee employee) {

		Employee existsEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		if (existsEmployee!=null) {

			existsEmployee.setId(employee.getId());
			existsEmployee.setPhoneno(employee.getPhoneno());

			return employeeRepository.save(existsEmployee);

		} else {
			return null;
		}
	}

	public Employee get(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee find(Long id) {
		return employeeRepository.findById(id).get();
	}

	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}
}