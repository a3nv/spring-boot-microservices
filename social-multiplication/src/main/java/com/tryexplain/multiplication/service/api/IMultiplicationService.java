package com.tryexplain.multiplication.service.api;

import com.tryexplain.multiplication.domain.Multiplication;

public interface IMultiplicationService {

    /**
     * Creates a Multiplication object with two randomly-generated factors between 11 and 99;
     * @return a Multiplication object with random factors
     */
    Multiplication createRandomMultiplication();
}
