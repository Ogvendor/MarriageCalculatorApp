package com.victor.calculatorapp.services;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.data.repositories.MarriageCalculatorRepository;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarriageCalculatorServiceImpl implements MarriageCalculatorService{


    private final MarriageCalculatorRepository marriageCalculatorRepository;

    public MarriageCalculatorServiceImpl(MarriageCalculatorRepository marriageCalculatorRepository) {
        this.marriageCalculatorRepository = marriageCalculatorRepository;
    }


    @Override
    public MarriageCalculator saveCouple(MarriageCalculatorDto marriageCalculatorDto) {
        MarriageCalculator marriageCalculator = new MarriageCalculator();
        marriageCalculator.setBoyAge(marriageCalculatorDto.getBoyAge());
        marriageCalculator.setGirlAge(marriageCalculatorDto.getGirlAge());
        marriageCalculator.setBoyName(marriageCalculatorDto.getBoyName());
        marriageCalculator.setGirlName(marriageCalculatorDto.getGirlName());

        marriageCalculatorRepository.save(marriageCalculator);
        return marriageCalculator;
    }

    @Override
    public String calculateMarriage(Long id) {
        String result = "";
        Optional<MarriageCalculator> marriageCalculator = marriageCalculatorRepository.findById(id);
        if(marriageCalculator.isPresent()){
            int totalAge = marriageCalculator.get().getBoyAge() + marriageCalculator.get().getGirlAge();
            if (totalAge < 50){
                int waitTime = 50 - totalAge;
                result = "You should get married in " + waitTime + " years time";
            }else {
                result = "You're eligble for marriage";
            }

        }
        return result;
    }
}
