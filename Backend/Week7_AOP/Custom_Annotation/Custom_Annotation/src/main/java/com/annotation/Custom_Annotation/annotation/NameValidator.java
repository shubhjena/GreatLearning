package com.annotation.Custom_Annotation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class NameValidator implements ConstraintValidator<NameValidation,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        List<String> list = Arrays.asList(new String[]{"Obama", "Biden", "Trump"});
        return list.contains(s);
    }
}
