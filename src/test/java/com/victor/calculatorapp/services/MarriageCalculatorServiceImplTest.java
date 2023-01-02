package com.victor.calculatorapp.services;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.data.repositories.MarriageCalculatorRepository;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MarriageCalculatorServiceImplTest {
    @Autowired
    MarriageCalculatorRepository marriageCalculatorRepository;

    MarriageCalculatorService marriageCalculatorService;

    @BeforeEach
    void setUp() {
        marriageCalculatorService = new MarriageCalculatorServiceImpl(marriageCalculatorRepository);
    }

    @Test
    void checkUserExistTest(){
        MarriageCalculator marriageCalculator = new MarriageCalculator();
        MarriageCalculatorDto marriageCalculatorDto = new MarriageCalculatorDto("victor","love",24,23);
        marriageCalculator = marriageCalculatorService.saveCouple(marriageCalculatorDto);
        assertNotNull(marriageCalculator);
    }
    @Test
    void calculateAgeDifferencesTest(){
        MarriageCalculator marriageCalculator = new MarriageCalculator();
        MarriageCalculatorDto marriageCalculatorDto = new MarriageCalculatorDto("victor","love",24,23);
        marriageCalculator = marriageCalculatorService.saveCouple(marriageCalculatorDto);
        assertNotNull(marriageCalculator);

        String result = marriageCalculatorService.calculateMarriage(1L);
        assertEquals(result, marriageCalculatorService.calculateMarriage(marriageCalculator.getId()));
    }

}