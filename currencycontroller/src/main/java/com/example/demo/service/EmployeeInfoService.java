package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeInfo;
import com.example.demo.repository.EmployeeInfoRepository;

@Service
public class EmployeeInfoService {
	
	@Autowired
	private EmployeeInfoRepository employeeInfoRepository;
	
	@Autowired
	private EmployeeInfo employee_info;
	
	public EmployeeInfo save(EmployeeInfo employeeInfo) {
		return employeeInfoRepository.save(employeeInfo);
	}
	
	public EmployeeInfo get(Long id) {
		return employeeInfoRepository.findById(id).orElse(null);
	}
	
	public EmployeeInfo put(EmployeeInfo employeeInfo) {
		
		EmployeeInfo existsEmployee = employeeInfoRepository.findById(employeeInfo.getId()).orElse(null);
		if(existsEmployee!=null) {
			
			existsEmployee.setId(employeeInfo.getId());
			existsEmployee.setSalary(employeeInfo.getSalary());
			existsEmployee.setDepartment(employeeInfo.getDepartment());
			existsEmployee.setEmployeeType(employeeInfo.getEmployeeType());
			existsEmployee.setWorkLocation(employeeInfo.getWorkLocation());
			existsEmployee.setEmployeeStatus(employeeInfo.getEmployeeStatus());
			existsEmployee.setPhoneno(employeeInfo.getPhoneno());
			
			return employeeInfoRepository.save(existsEmployee);
			
		}
		else {
			return null;
		}
	}
	
	public List<EmployeeInfo> getAll(){
		return employeeInfoRepository.findAll();
	}
	
	public EmployeeInfo find(Long id) {
		return employeeInfoRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		employeeInfoRepository.deleteById(id);
	}
	
	

	public EmployeeInfo salaryCalculator(String country) {
	    double convertedSalary = CurrencyConverterUtil.convertSalary(employee_info.getSalary(),country);
	    employee_info.setSalary((long) convertedSalary);
	    return employee_info;
	}

}