package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeAddress;

@Repository
public interface EmployeAddressrepository extends JpaRepository<EmployeAddress,Long>{

}
