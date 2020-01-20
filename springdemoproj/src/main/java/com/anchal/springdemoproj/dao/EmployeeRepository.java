package com.anchal.springdemoproj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anchal.springdemoproj.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
