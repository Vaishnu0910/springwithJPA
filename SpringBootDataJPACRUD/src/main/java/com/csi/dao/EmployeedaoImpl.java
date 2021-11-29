package com.csi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Component
public class EmployeedaoImpl {
	@Autowired
	
	EmployeeRepository employeerepositary;

	
	
	public List<Employee> getalldata() {
		// TODO Auto-generated method stub
		return employeerepositary.findAll();
	}


	public Employee signup(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepositary.save(employee);
	}


	public Employee updatedata(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepositary.save(employee);
	}


	public void deleteData(long empId) {
		// TODO Auto-generated method stub
		employeerepositary.deleteById(empId);
	}


	public void deletealldata() {
		// TODO Auto-generated method stub
		employeerepositary.deleteAll();
	}

	}

	
	

