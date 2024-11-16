package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeAddress;
import com.example.demo.repository.EmployeeAddressRepository;

@Service
public class EmployeeAddressService {

	@Autowired
	private EmployeeAddressRepository empAddressRepository;

	public EmployeeAddress save(EmployeeAddress employeeAddress) {
		return empAddressRepository.save(employeeAddress);
	}

	public EmployeeAddress put(EmployeeAddress employeeAddress) {
		EmployeeAddress existsEmployee = empAddressRepository.findById(employeeAddress.getId()).orElse(null);

		if(existsEmployee!=null) {
			
			existsEmployee.setId(employeeAddress.getId());
			existsEmployee.setStreet(employeeAddress.getStreet());
			existsEmployee.setLocation(employeeAddress.getLocation());
			
			return empAddressRepository.save(existsEmployee);
		}
		else {
			return null;
		}
	}

	public EmployeeAddress getById(Long id) {
		return empAddressRepository.findById(id).orElse(null);
	}

	public List<EmployeeAddress> getAll() {
		return empAddressRepository.findAll();
	}

	public EmployeeAddress find(Long id) {
		return empAddressRepository.findById(id).get();
	}

	public void delete(Long id) {
		empAddressRepository.deleteById(id);
	}
}