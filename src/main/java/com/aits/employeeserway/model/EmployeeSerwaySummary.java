package com.aits.employeeserway.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeSerwaySummary")
public class EmployeeSerwaySummary {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serwayID")
	private int serwayID;
	
	@Column(name="year")
	private String year;

	@Column(name="blankSubmittedCount")
	private int blankSubmittedCount;
	
	@Column(name="submittedCount")
	private int submittedCount;

	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public int getSerwayID() {
		return serwayID;
	}

	public void setSerwayID(int serwayID) {
		this.serwayID = serwayID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getBlankSubmittedCount() {
		return blankSubmittedCount;
	}

	public void setBlankSubmittedCount(int blankSubmittedCount) {
		this.blankSubmittedCount = blankSubmittedCount;
	}

	public int getSubmittedCount() {
		return submittedCount;
	}

	public void setSubmittedCount(int submittedCount) {
		this.submittedCount = submittedCount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



}
