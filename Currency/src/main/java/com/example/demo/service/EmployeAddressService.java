package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeAddress;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeAddressrepository;

@Service
public class EmployeAddressService {

	@Autowired
	private EmployeAddressrepository employeaddressrepository;

	public List<EmployeAddress> getAll() {
		return employeaddressrepository.findAll();
	}

	public Optional<EmployeAddress> get(Long id) {
		return employeaddressrepository.findById(id);
	}

	public void delete(Long id) {
		employeaddressrepository.deleteById(id);

	}

	public EmployeAddress saveOrUpdate(Employee emp) {

		return ((EmployeAddressService) employeaddressrepository).saveOrUpdate(emp);
	}

}
