package com.anchal.springdemoproj.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anchal.springdemoproj.dao.EmployeeDAO;
import com.anchal.springdemoproj.entity.Employee;
import com.anchal.springdemoproj.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;
	
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
}
