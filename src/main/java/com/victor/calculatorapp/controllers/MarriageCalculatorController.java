package com.victor.calculatorapp.controllers;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import com.victor.calculatorapp.services.MarriageCalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@AllArgsConstructor
@RestController
public class MarriageCalculatorController {
    private MarriageCalculatorService marriageCalculatorService;

    @PostMapping("/saves")
    public String saveCouples(@ModelAttribute("marriageCalculator") MarriageCalculatorDto marriageCalculatorDto) {
        marriageCalculatorService.saveCouple(marriageCalculatorDto);
        return "result";
    }


    @PostMapping("/couple")
    public ResponseEntity<?> saveCouple(@RequestBody MarriageCalculatorDto marriageCalculatorDto){
       MarriageCalculator marriageCalculator = marriageCalculatorService.saveCouple(marriageCalculatorDto);
       return new ResponseEntity<>(marriageCalculator, HttpStatus.CREATED);
    }
    @GetMapping("/marriage/{id}")
    public ResponseEntity<?> calculateMarriage(@PathVariable Long id){
        String result = marriageCalculatorService.calculateMarriage(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
