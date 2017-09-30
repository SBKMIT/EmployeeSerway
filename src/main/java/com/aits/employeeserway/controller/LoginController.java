package com.aits.employeeserway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.employeeserway.constants.AppConstants;
import com.aits.employeeserway.model.Employee;
import com.aits.employeeserway.service.EmployeeService;
import com.aits.employeeserway.validators.EmployeeValidator;
import com.aits.employeeserway.validators.LoginValidator;

@Controller
public class LoginController implements AppConstants{


	@Autowired
	private EmployeeService employeeService;

	@Autowired(required=true)
	private LoginValidator loginValidator;


	@RequestMapping(value=LOGIN,method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("employee",new Employee());
		return "login";
	}

	@RequestMapping(value=ROOT,method=RequestMethod.GET)
	public String HomePage(Model model){
		model.addAttribute("employee",new Employee());
		return "login";
	}

	@RequestMapping(value=LOGINEMPLOYEE,method=RequestMethod.POST)
	public String loginCheck(@ModelAttribute("employee") @Validated Employee employee,Model model,BindingResult result){
		System.out.println("Hiii"+employee.getLoginID());
		
						
		loginValidator.validate(employee, result);
		if (result.hasErrors()) {
		  return "login";
		}
	
		int employeeID=employeeService.loginCheck(employee);
		System.out.println("Hiii"+employeeID);
		if(employeeID==0){
			model.addAttribute("errorMsg","Invalid Creaditials");
			model.addAttribute("employee",new Employee());
			return"login";
		}

		System.out.println("Hiii");
		Employee employeeType=employeeService.getEmployee(employeeID);

		if(employeeType.getDesignation()=="HR"){
			return"HRHome";

		}else if(employeeType.getDesignation()=="Management"){
			return"ManagementHome";

		}else{
			return"EmployeeHome";

		}

	}


}
