package com.victor.calculatorapp.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarriageCalculator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String boyName;
    private String girlName;
    private int boyAge;
    private int girlAge;


}
