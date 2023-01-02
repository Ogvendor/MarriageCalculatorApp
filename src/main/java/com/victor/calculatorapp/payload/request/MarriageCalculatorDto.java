package com.victor.calculatorapp.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarriageCalculatorDto {
    private String boyName;
    private String girlName;
    private int boyAge;
    private int girlAge;
}
