package controller;

import model.Complex;
import model.repository.ComplexRepository;

public class CalculatorController{
    private ComplexRepository complexRepository;

    public CalculatorController(ComplexRepository complexRepository) {
        this.complexRepository = complexRepository;
    }

    public Complex plus(Complex a, Complex b) {
        return complexRepository.plus(a, b);
    }

    public Complex minus(Complex a, Complex b) {
        return complexRepository.minus(a, b);
    }

    public Complex product(Complex a, Complex b) {
        return complexRepository.product(a, b);
    }

    public Complex divide(Complex a, Complex b) {
        return complexRepository.divide(a, b);
    }
}
