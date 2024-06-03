package model.repository;

import model.Complex;

public interface ComplexRepository{
    Complex plus(Complex a, Complex b);

    Complex minus(Complex a, Complex b);

    Complex product(Complex a, Complex b);

    Complex divide(Complex a, Complex b);
}
