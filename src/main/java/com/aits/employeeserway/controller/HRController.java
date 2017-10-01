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
import com.aits.employeeserway.model.SkillMaster;
import com.aits.employeeserway.service.EmployeeService;
import com.aits.employeeserway.validators.EmployeeValidator;
import com.aits.employeeserway.validators.SkiilMasterValidator;


@Controller
public class HRController implements AppConstants {


	@Autowired
	private EmployeeService employeeService;

	@Autowired(required=true)
	private EmployeeValidator employeeValidator;

	@Autowired(required=true)
	private SkiilMasterValidator skillMasterValidator;
	

	@RequestMapping(value=HRHOME,method=RequestMethod.GET)
	public String HRHomePage(Model model){

		return "HRHome";
	}

	@RequestMapping(value=ADDEMPLOYEE,method=RequestMethod.GET)
	public String addEmployeePage(Model model){


		model.addAttribute("employee",new Employee());

		return "addEmployee";
	}

	@RequestMapping(value=SAVEEMPLOYEE,method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") @Validated Employee employee,Model model, BindingResult result){
		employeeValidator.validate(employee, result);
		if (result.hasErrors()) {
			return "addEmployee";
		}
		employeeService.saveEmployee(employee);
		return "HRHome";
	}

@RequestMapping(value=ADDSKILLS,method=RequestMethod.GET)
	public String addSkillPage(Model model){

	model.addAttribute("skillMaster",new SkillMaster());
	
		return"addskills";
	}	
@RequestMapping(value=SAVESKILL,method=RequestMethod.POST)
public String saveSkill(@ModelAttribute("SkillMaster") @Validated SkillMaster skillMaster,Model model,BindingResult result){
	skillMasterValidator.validate(skillMaster, result);
	if(result.hasErrors()){
		
		return"addskills";
	}
	
	return"HRHome";
}

}
