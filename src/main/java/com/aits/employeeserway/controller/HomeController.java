package com.aits.employeeserway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aits.employeeserway.constants.AppConstants;


@Controller
public class HomeController implements AppConstants{

	
	@GetMapping(value=ROOT)
	public String homepage(Model model){
				
		return "index";
	}
	
}
