package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.EmployeeInformation;

@Repository
public interface EmployeInformationrepository extends JpaRepository<EmployeeInformation,Long> {

}
