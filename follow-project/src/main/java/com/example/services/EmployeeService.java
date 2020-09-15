package com.example.services;

import java.util.List;

import com.example.entities.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public void deleteEmployee(Long id);

	public List<Employee> getEmployee();

}
