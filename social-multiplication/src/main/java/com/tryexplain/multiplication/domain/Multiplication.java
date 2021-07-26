package com.tryexplain.multiplication.domain;

public final class Multiplication {

    private final int factorA;
    private final int factorB;

    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Multiplication{" + "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result(A*B)=" + result +
                '}';
    }
}
