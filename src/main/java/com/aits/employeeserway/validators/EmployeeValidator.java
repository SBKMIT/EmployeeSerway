package com.aits.employeeserway.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aits.employeeserway.model.Employee;

@Component
public class EmployeeValidator implements Validator{
	
	
	private Pattern pattern;  
	 private Matcher matcher;  
	  
	 private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"  
	   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";  
	 String ID_PATTERN = "[0-9]+";  
	 String STRING_PATTERN = "[a-zA-Z]+";  
	 String MOBILE_PATTERN = "[0-9]{10}";  
	
	

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		Employee employee=(Employee)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailID", "emailID.required");
		// email validation in spring  
		  if (!(employee.getEmailID() != null && employee.getEmailID().isEmpty())) {  
		   pattern = Pattern.compile(EMAIL_PATTERN);  
		   matcher = pattern.matcher(employee.getEmailID());  
		   if (!matcher.matches()) {  
		    errors.rejectValue("emailID", "emailID.incorrect");  
		   }  
		  }  
		
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "loginID", "loginID.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		ValidationUtils.rejectIfEmpty(errors, "designation", "designation.required");
		/*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "department.departmentID", "department.required");
		*/
		if(employee.getDepartment().getDepartmentID()==0){
			errors.rejectValue("department.departmentID", "department.required");
		}
		
		
		
		
		
	}

}
