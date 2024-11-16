package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class EmployeAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	
	private Long id;
	private String street;
	private String city;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
