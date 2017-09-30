package com.aits.employeeserway.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.employeeserway.dao.EmployeeDAO;
import com.aits.employeeserway.model.Employee;

@Repository("EmployeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer employeeID=(Integer) session.save(employee);
		transaction.commit();
		
		employee.setEmployeeID(employeeID);
		return employee;
	}

}
