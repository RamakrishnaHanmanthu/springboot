package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeInformation;
import com.example.demo.repository.Employeerepository;

import jakarta.persistence.Converter;

@Service
public class EmployeeService {

	@Autowired
	private Employeerepository employeerepository;
	
	@Autowired	
	Converter convertSalary;
	
	@Autowired
	EmployeInformationService employeinformationservice;

	public List<Employee> getAll() {
		return employeerepository.findAll();
	}

	public Employee get(Long Id) {
		Optional<Employee> emp = employeerepository.findById(Id);
		Employee emp1 =emp.get();
		
		Long salary = emp1.getEmployeeinfo().getSalary();
		String country = emp1.getEmployeeinfo().getCountry();
	
		EmployeeInformation empinfo= emp1.getEmployeeinfo();
		
		
		
		
      	EmployeeInformation empinfo1 = emp1.getEmployeeinfo();
      	 
      	empinfo1.setCountry(country);
      	empinfo1.setSalary(salary);
     
      	emp1.setEmployeeinfo(empinfo1);
		return emp1;
	}

	public Employee saveOrUpdate(Employee emp) {
		return employeerepository.save(emp);

	}

	public void delete(Long Id) {

		employeerepository.deleteById(Id);
		
	}
}
