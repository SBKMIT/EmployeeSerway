package com.aits.employeeserway.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aits.employeeserway.model.Employee;

@Component
public class LoginValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee=(Employee)target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "loginID", "loginID.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");

	}

}
