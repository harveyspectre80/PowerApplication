package com.thoughtworks.powercalculator.service;

import org.springframework.stereotype.Service;

import com.thoughtworks.powercalculator.dto.NumberDTO;

@Service
public class ExponentialValueService implements IExponentValueService {
	@Override
	public int calculatePower(NumberDTO numberDTO) {
		System.out.println("ExponentialValueService.calculatePower()");
		int baseValue = numberDTO.getBaseValue();
		int raisedValue = numberDTO.getRaisedValue();

		System.out.println(baseValue);
		System.out.println(raisedValue);
		
		int exponentValue = 1;
        while (raisedValue != 0)
        {
            exponentValue = exponentValue * baseValue;
            --raisedValue;
        }
        System.out.println("Answer = " + exponentValue);
		return exponentValue;
	}
}
