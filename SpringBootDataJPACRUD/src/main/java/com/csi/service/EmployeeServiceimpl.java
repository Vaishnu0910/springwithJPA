package com.csi.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeedaoImpl;
import com.csi.model.Employee;

@Service
public class EmployeeServiceimpl {
	@Autowired
	EmployeedaoImpl employeedao;

	
	
	public List<Employee> getalldata() {
		// TODO Auto-generated method stub
		return employeedao.getalldata();
	}


	public Employee signup(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.signup(employee);
	}


	public Employee updatedata(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.updatedata(employee);
	}


	public void deleteData(long empId) {
		// TODO Auto-generated method stub
	employeedao.deleteData(empId);
	}


	public void deletealldata() {
		// TODO Auto-generated method stub
		employeedao.deletealldata();
		
	}


	

	
	}


	



