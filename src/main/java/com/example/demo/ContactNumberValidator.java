package com.example.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.stream.Collector;

import static java.util.stream.Collectors.toList;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {
    private ContactNumberConstraint contactNumberConstraint;

    @Override
    public void initialize(ContactNumberConstraint constraintAnnotation) {
        this.contactNumberConstraint = constraintAnnotation;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Class<? extends Enum<?>> enumClass = contactNumberConstraint.enumClass();

        context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(contactNumberConstraint.message() + Arrays.stream(contactNumberConstraint.enumClass().getEnumConstants()).collect(toList())).addConstraintViolation();

        return false;
    }
}
