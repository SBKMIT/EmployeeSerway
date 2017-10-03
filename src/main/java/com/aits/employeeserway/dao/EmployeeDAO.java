package com.aits.employeeserway.dao;

import com.aits.employeeserway.model.Employee;
import com.aits.employeeserway.model.SkillMaster;

public interface EmployeeDAO {
	public Employee saveEmployee(Employee employee);
	public int loginCheck(Employee employee);
	public Employee getEmployee(int employeeID);
	public void saveSkill(SkillMaster skillMaster);
	
}
