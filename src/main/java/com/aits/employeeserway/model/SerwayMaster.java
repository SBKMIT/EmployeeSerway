package com.aits.employeeserway.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SerwayMaster")
public class SerwayMaster {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serwayID")
	private int serwayID;
	
	@Column(name="year",length=4)
	private String year;
	
	@Column(name="startDate")
	private Date startDate;
	
	@Column(name="endDate")
	private Date endDate;
	
	
	
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
