package com.tryexplain.multiplication.service;

import com.tryexplain.multiplication.domain.Multiplication;
import com.tryexplain.multiplication.service.api.IMultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService implements IMultiplicationService {

    private final RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationService(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }
}
