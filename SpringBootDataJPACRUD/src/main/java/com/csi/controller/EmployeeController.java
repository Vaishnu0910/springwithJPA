package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceimpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceimpl employeeservice;
	
	
	@PostMapping("/signup")
	public ResponseEntity<Employee> signup(@RequestBody Employee employee)
	{
		return ResponseEntity.ok(employeeservice.signup(employee));
	}
	
	
	@PostMapping("/savealldata")
	public ResponseEntity<List<Employee>>savealldata(@ResponseBody Employee employee)
	{
		return ResponseEntity.ok(employeeservice.savealldata());
	}
	
	
	
	
	@PutMapping("/updatedata/{empId}")
	public ResponseEntity<Employee>updatedata(@PathVariable long empId,@RequestBody Employee employee)
	{
		return ResponseEntity.ok(employeeservice.updatedata(employee));
	}
	
	@GetMapping("/getalldata")
	public ResponseEntity<List<Employee>>getalldata()
	{
		return ResponseEntity.ok(employeeservice.getalldata());
	}
	
	 @DeleteMapping("/deletedata/{empId}")
	    public ResponseEntity<String> deleteData(@PathVariable long empId)
	    {
	        employeeservice.deleteData(empId);
	        return ResponseEntity.ok("Data Deleted Successfully");
	    }
	 
	 @DeleteMapping("deletealldata")
	 public ResponseEntity<String>deletealldata(@RequestBody Employee employee)
	 {
		 employeeservice.deletealldata();
		 return ResponseEntity.ok("data delete successfully");
	 }
	
}
