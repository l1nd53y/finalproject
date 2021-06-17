package com.l1nd53y.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.l1nd53y.finalproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}