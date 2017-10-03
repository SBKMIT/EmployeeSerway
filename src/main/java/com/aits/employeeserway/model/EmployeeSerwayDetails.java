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
@Table(name="EmployeeSerwayDetails")
public class EmployeeSerwayDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "srID")
	private int srID;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "rating")
	private int rating;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SerwayMaster serwayMaster;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Employee employee;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SkillMaster skillMaster;
	
	public int getSrID() {
		return srID;
	}
	public void setSrID(int srID) {
		this.srID = srID;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public SerwayMaster getSerwayMaster() {
		return serwayMaster;
	}
	public void setSerwayMaster(SerwayMaster serwayMaster) {
		this.serwayMaster = serwayMaster;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public SkillMaster getSkillMaster() {
		return skillMaster;
	}
	public void setSkillMaster(SkillMaster skillMaster) {
		this.skillMaster = skillMaster;
	}
	
	
	
}
