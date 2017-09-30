package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.employeeserway.constants.AppConstants;

@Controller
public class EmployeeController implements AppConstants {

	

	@RequestMapping(value=EMPLOYEEHOME,method=RequestMethod.GET)
	public String EmployeeHomePage(Model model){
		return "EmployeeHome";
	}
}
