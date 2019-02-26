package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class RestExam {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return "babu";
	}

	@RequestMapping(value = "name", method = RequestMethod.POST)
	public void ok(@RequestBody @Valid Babu babu) {
		System.out.println("babu = [" + babu + "]");

	}

}
