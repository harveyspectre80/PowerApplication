package com.thoughtworks.powercalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.powercalculator.service.ExponentialValueService; 
import com.thoughtworks.powercalculator.dto.NumberDTO;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/exponentialvaluecalculator")
@RestController
public class ExponentValueCalculatorController {
	
	@Autowired
	ExponentialValueService exponentialservice;

	@PostMapping("/calculate")
	public int calculation(@RequestBody NumberDTO numberDTO) {
		System.out.println("in controller");

		int exponentialValue = exponentialservice.calculatePower(numberDTO);
		return exponentialValue;
	}

}
