package com.victor.calculatorapp.services;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.data.repositories.MarriageCalculatorRepository;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import lombok.Builder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Builder
@SpringBootTest
public class MarriageCalculatorServiceImplTest {

      private MarriageCalculatorService marriageCalculatorService;
      private MarriageCalculatorDto marriageCalculatorDto;
      private MarriageCalculatorRepository marriageCalculatorRepository;
      private MarriageCalculator marriageCalculator;
    @BeforeEach
    void setUp() {
        marriageCalculatorService = new MarriageCalculatorServiceImpl(this.marriageCalculatorRepository);
        marriageCalculatorDto = new MarriageCalculatorDto();
        marriageCalculator = new MarriageCalculator();
    }
    @Test
    void UsersExistTest(){

//       marriageCalculatorDto.setBoyName("victor");
//       marriageCalculatorDto.setGirlName("love");
//       marriageCalculatorDto.setBoyAge(24);
//       marriageCalculatorDto.setGirlAge(23);
//
//       MarriageCalculator marriageCalculator1 = marriageCalculatorService.saveCouple(marriageCalculatorDto);
//
//       assertEquals(4,marriageCalculator1);
//               .boyName("victor")
//               .girlName("")
//               .boyAge().build()
//               .girlAge().build();


    }
}