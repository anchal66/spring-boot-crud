package com.anchal.springdemoproj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anchal.springdemoproj.dao.EmployeeDAO;
import com.anchal.springdemoproj.dao.EmployeeRepository;
import com.anchal.springdemoproj.entity.Employee;

@Repository
public class EmployeeServiceImplForSpringDataJPA implements EmployeeService{
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImplForSpringDataJPA(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee theEmployee = null;
		
		if(result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			throw new RuntimeException("not found "+id);
		}
		return theEmployee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);		
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);		
	}

}
