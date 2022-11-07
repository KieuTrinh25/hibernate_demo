package com.springmvc.hibernatedemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.hibernatedemo.entity.Employee;
import com.springmvc.hibernatedemo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeDAO;

	@Override
	@Transactional
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		return employeeDAO.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		employeeDAO.deleteEmployee(theId);
	}

}
