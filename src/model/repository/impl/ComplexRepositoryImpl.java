package model.repository.impl;

import model.Complex;
import model.repository.ComplexRepository;

public class ComplexRepositoryImpl implements ComplexRepository {
    @Override
    public Complex plus(Complex a, Complex b) {
        double real = a.getReal() + b.getReal();
        double image = a.getImage() + b.getImage();

        return new Complex(real, image);
    }

    @Override
    public Complex minus(Complex a, Complex b) {
        double real = a.getReal() - b.getReal();
        double image = a.getImage() - b.getImage();

        return new Complex(real, image);
    }

    @Override
    public Complex product(Complex a, Complex b) {
        double real = a.getReal() * b.getReal() - a.getImage() * b.getImage();
        double image = a.getReal() * b.getImage() + a.getImage() * b.getReal();

        return new Complex(real, image);
    }

    @Override
    public Complex divide(Complex a, Complex b) {
        Complex product = product(a, conjugate(b));
        double abs = b.getAbs();
        double d = abs * abs;

        return new Complex(product.getReal() / d, product.getImage() / d);
    }

    private Complex conjugate(Complex a){
        return new Complex(a.getReal(), -a.getImage());
    }
}
