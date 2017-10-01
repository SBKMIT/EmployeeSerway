package com.aits.employeeserway.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aits.employeeserway.model.SkillMaster;

@Component
public class SkiilMasterValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return SkillMaster.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		SkillMaster skillMaster=(SkillMaster)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "skill", "skill.required");
		if(skillMaster.getSkill().length()>75){
			
			errors.rejectValue("skill","skill.incorrect");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "description.required");
         if(skillMaster.getDescription().length()>75){
			
			errors.rejectValue("description","description.incorrect");
		}
		
	}

}
