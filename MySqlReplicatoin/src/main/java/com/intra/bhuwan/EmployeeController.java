package com.intra.bhuwan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

	@Autowired
	private IEmployeeService serivce;
	
	@PostMapping("/insert")
	public String saveEmloyee(
			@RequestBody Employee employee) 
	{
		serivce.saveEmployee(employee);
		return "data inserted";
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Employee>> findEmployee() 
	{
		List<Employee> list = serivce.fetchEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(list);
		
	}
	
}
