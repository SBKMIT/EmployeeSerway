package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.employeeserway.constants.AppConstants;
import com.aits.employeeserway.model.Employee;

@Controller
public class LogoutController implements AppConstants{

	
	@RequestMapping(value=LOGOUT,method=RequestMethod.GET)
	public String logout(Model model){
		model.addAttribute("employee",new Employee());
		return "login";
	}
	
}
