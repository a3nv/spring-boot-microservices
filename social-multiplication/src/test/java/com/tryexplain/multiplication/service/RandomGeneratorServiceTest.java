package com.tryexplain.multiplication.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class RandomGeneratorServiceTest {

    private final RandomGeneratorService randomGeneratorService = new RandomGeneratorService();


    @Test
    void generateRandomFactorIsBetweenExpectedLimits() {
        // when a good sample of randomly generated factors is generated
        List<Integer> randomFactors = IntStream.range(0, 1000)
                .map(i -> randomGeneratorService.generateRandomFactor())
                .boxed().collect(Collectors.toList());

        // then all of them should be between 11 and 100 because we want a middle-complexity calculation
        assertThat(randomFactors).isSubsetOf(IntStream.range(11, 100).boxed().collect(Collectors.toList()));
    }

}