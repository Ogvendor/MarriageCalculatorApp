package com.victor.calculatorapp.data.repositories;

import com.victor.calculatorapp.data.model.MarriageCalculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriageCalculatorRepository extends JpaRepository<MarriageCalculator,Long> {

}
