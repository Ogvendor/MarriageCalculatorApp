package com.victor.calculatorapp.services;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.data.repositories.MarriageCalculatorRepository;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import org.springframework.stereotype.Service;

@Service
public interface MarriageCalculatorService {

    MarriageCalculator saveCouple(MarriageCalculatorDto marriageCalculatorDto);
    String calculateMarriage(Long id);

}
