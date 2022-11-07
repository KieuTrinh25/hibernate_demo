package com.springmvc.hibernatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.hibernatedemo.entity.Employee;
import com.springmvc.hibernatedemo.service.EmployeeService;
 
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		List<Employee> theEmployee = employeeService.getEmployee();
		theModel.addAttribute("employee", theEmployee);
		return "list-employee";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		employeeService.saveEmployee(theEmployee);	
		return "redirect:/employee/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {
		Employee theEmployee = employeeService.getEmployee(theId);	
		theModel.addAttribute("employee", theEmployee);
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId, Model theModel) {
		employeeService.deleteEmployee(theId); 
		return "redirect:/employee/list";
	}

}
