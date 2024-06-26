package gb.danila.controller;

import gb.danila.model.Complex;

public interface CalculatorController {
    Complex plus(Complex a, Complex b);

    Complex minus(Complex a, Complex b);

    Complex product(Complex a, Complex b);

    Complex divide(Complex a, Complex b);
}
