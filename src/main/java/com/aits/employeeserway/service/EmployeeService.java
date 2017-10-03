package com.aits.employeeserway.service;

import com.aits.employeeserway.model.Employee;
import com.aits.employeeserway.model.SkillMaster;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public int loginCheck(Employee employee);
	public Employee getEmployee(int employeeID);
	
	public void saveSkill(SkillMaster skillMaster);
}
