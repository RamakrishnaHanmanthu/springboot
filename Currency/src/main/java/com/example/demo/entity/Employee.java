package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeess")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "information_id", referencedColumnName = "id")
	private EmployeeInformation employeeinfo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private EmployeAddress address;
	public EmployeeInformation setEmployeeinfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeInformation getEmployeeinfo() {
		return employeeinfo;
	}

	public void setEmployeeinfo(EmployeeInformation employeeinfo) {
		this.employeeinfo = employeeinfo;
	}

	public EmployeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeAddress address) {
		this.address = address;
	}

	

	

}
