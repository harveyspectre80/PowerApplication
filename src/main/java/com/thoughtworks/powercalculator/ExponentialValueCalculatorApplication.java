package com.thoughtworks.powercalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ExponentialValueCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExponentialValueCalculatorApplication.class, args);
	}

}
