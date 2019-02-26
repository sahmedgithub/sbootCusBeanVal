package com.example.demo;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import java.util.Set;

import static org.junit.Assert.*;

public class ContactNumberValidatorTest {
    private Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    public void testContactSuccess() {
        // I'd name the test to something like
        // invalidEmailShouldFailValidation()

        Babu babu = Babu.builder().build();

        Set<ConstraintViolation<Babu>> violations = validator.validate(babu);
        assertFalse(violations.isEmpty());
    }
}