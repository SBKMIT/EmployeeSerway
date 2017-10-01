package com.aits.employeeserway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.aits.employeeserway.constants.AppConstants;
import com.aits.employeeserway.model.Employee;
import com.aits.employeeserway.service.EmployeeService;
import com.aits.employeeserway.validators.EmployeeValidator;

@Controller
public class EmployeeRegistrationController implements AppConstants {

	
	/*@Autowired
	private EmployeeService employeeService;
	
	@Autowired(required=true)
	private EmployeeValidator employeeValidator;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registrationPage(Model model){
		
		model.addAttribute("employee",new Employee());
		return "registration";
		
	}
	*/
	/*@RequestMapping(value=SAVEEMPLOYEE,method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") @Validated Employee employee,Model model, BindingResult result){
		employeeValidator.validate(employee, result);
		 if (result.hasErrors()) {
	            return "registration";
	        }
		employeeService.saveEmployee(employee);
		return "login";
	}
	*/
}
