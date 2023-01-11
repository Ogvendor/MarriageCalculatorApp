package com.victor.calculatorapp.controllers;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import com.victor.calculatorapp.payload.request.MarriageCalculatorDto;
import com.victor.calculatorapp.services.MarriageCalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api")
@AllArgsConstructor
@RestController
public class MarriageCalculatorController {
    private MarriageCalculatorService marriageCalculatorService;



    @GetMapping("/saves")
    public String saveCouples(Model model) {
        model.addAttribute("formData", new MarriageCalculatorDto());
        return "api/saves";
    }
    @PostMapping("/saves")
    public String saveMarriage(@Valid @ModelAttribute("formData") MarriageCalculatorDto formData,
                               BindingResult bindingResult,
                               Model model) {
        if (bindingResult.hasErrors()) {
            return "api/saves";
        }

        marriageCalculatorService.saveCouple(formData);

        return "redirect:/api";
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
