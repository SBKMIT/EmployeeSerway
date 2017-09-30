package com.aits.employeeserway.daoImpl;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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

	@Override
	public int loginCheck(Employee employee) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int employeeID = 0;

		String login_hql = "Select employee.EmployeeID from Employee employee  where employee.loginID=:loginID and employee.password=:password";   
		System.out.println(login_hql);
		Query query = session.createQuery(login_hql);
		query.setParameter("loginID", employee.getLoginID());
		query.setParameter("password", employee.getPassword());
		List result = query.list();
		System.out.println("resultset:"+result);
		Iterator iterator = result.iterator();
		while(iterator.hasNext()){
			employeeID = (int) iterator.next();
		}
		transaction.commit();
		return employeeID;

	}

	@Override
	public Employee getEmployee(int employeeID) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=session.get(Employee.class,employeeID);
		transaction.commit();
		
		return employee;
	}}

