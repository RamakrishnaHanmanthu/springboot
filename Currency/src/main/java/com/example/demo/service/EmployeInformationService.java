package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeInformation;
import com.example.demo.repository.EmployeInformationrepository;

@Service
public class EmployeInformationService {

	@Autowired
	private EmployeInformationrepository employeeinformationrepository;
	

	public List<EmployeeInformation> getAll() {
		return employeeinformationrepository.findAll();
	}

	public Optional<EmployeeInformation> get(Long id) {
		return employeeinformationrepository.findById(id);
	}

	public EmployeeInformation saveOrUpdate(EmployeeInformation empinfo) {
		return employeeinformationrepository.save(empinfo);
	}

	public void delete(Long Id) {

		employeeinformationrepository.deleteById(Id);

	}

}
