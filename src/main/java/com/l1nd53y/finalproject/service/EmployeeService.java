package com.l1nd53y.finalproject.service;

import java.util.List;

import com.l1nd53y.finalproject.model.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
