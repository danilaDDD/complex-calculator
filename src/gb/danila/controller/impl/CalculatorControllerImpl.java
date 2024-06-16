package gb.danila.controller.impl;

import gb.danila.controller.CalculatorController;
import gb.danila.model.Complex;
import gb.danila.model.repository.ComplexRepository;

public class CalculatorControllerImpl implements CalculatorController {
    private ComplexRepository complexRepository;

    public CalculatorControllerImpl(ComplexRepository complexRepository) {
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
