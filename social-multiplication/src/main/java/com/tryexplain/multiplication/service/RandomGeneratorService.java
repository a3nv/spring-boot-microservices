package com.tryexplain.multiplication.service;

import com.tryexplain.multiplication.service.api.IRandomGeneratorService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorService implements IRandomGeneratorService {

    private static final int MINIMUM_FACTOR = 11;
    private static final int MAXIMUM_FACTOR = 99;

    @Override
    public int generateRandomFactor() {
        return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
    }
}
