package com.tryexplain.multiplication.service.api;

public interface IRandomGeneratorService {

    /**
     * @return a randomly-generate factor. It's always a number between 11 and 99.
     */
    int generateRandomFactor();
}
