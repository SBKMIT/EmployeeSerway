package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.employeeserway.constants.AppConstants;


@Controller
public class HRController implements AppConstants {
	@RequestMapping(value=HRHOME,method=RequestMethod.GET)
	public String HRHomePage(Model model){
		
		return "HRHome";
	}

}
