package com.brushbrosh.employeemanager.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.brushbrosh.employeemanager.entity.Employee;
import com.brushbrosh.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
}
