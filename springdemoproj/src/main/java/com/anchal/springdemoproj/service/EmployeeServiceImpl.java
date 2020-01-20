package com.anchal.springdemoproj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.anchal.springdemoproj.dao.EmployeeDAO;
import com.anchal.springdemoproj.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);		
	}

	@Override
	public void deleteById(int id) {
		employeeDAO.deleteById(id);		
	}

}
