package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aits.employeeserway.constants.AppConstants;
import com.aits.employeeserway.model.Employee;

@Controller
public class LoginController implements AppConstants{

	
	@RequestMapping(value=ROOT)
	public String loginPage(Model model){
				
		model.addAttribute("employee",new Employee());
		
		return "login";
	}
	
	
	
	
}
