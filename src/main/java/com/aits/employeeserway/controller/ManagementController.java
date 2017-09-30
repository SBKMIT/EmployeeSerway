package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.employeeserway.constants.AppConstants;

@Controller
public class ManagementController implements AppConstants {

	@RequestMapping(value=MANAGEMENTHOME,method=RequestMethod.GET)
	public String ManagementHomePage(Model model){
		
		return "ManagementHome";
	}
}
