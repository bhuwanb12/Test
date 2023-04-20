package com.intra.bhuwan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void saveEmployee(Employee emp) {
		repo.save(emp);
	}

	@Override
	public List<Employee> fetchEmployee() {
		return repo.findAll();
	}

}
