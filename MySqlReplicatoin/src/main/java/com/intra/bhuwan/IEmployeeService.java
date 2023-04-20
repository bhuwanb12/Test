package com.intra.bhuwan;

import java.util.List;

public interface IEmployeeService {

	public void saveEmployee(Employee emp);
	public List<Employee> fetchEmployee();
}
