package com.springmvc.hibernatedemo.service;

import java.util.List;

import com.springmvc.hibernatedemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
}
