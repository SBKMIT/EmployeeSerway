package com.aits.employeeserway.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.employeeserway.dao.EmployeeDAO;
import com.aits.employeeserway.model.Employee;
import com.aits.employeeserway.service.EmployeeService;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDAO.saveEmployee(employee);
	}

	public int loginCheck(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.loginCheck(employee);
	}

	public Employee getEmployee(int employeeID) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(employeeID);
	}
}
