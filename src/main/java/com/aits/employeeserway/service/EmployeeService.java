package com.aits.employeeserway.service;

import com.aits.employeeserway.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public int loginCheck(Employee employee);
	public Employee getEmployee(int employeeID);
}
