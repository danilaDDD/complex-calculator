package gb.danila.model.repository;

import gb.danila.model.Complex;

/**
 * Complex Number operations for complex calculator
 */
public interface ComplexRepository{
    /**
     * plus operation
     * @param a complex number 1
     * @param b complex number 2
     * @return result complex number
     */
    Complex plus(Complex a, Complex b);
    /**
     * minus operation
     * @param a complex number 1
     * @param b complex number 2
     * @return result complex number
     */
    Complex minus(Complex a, Complex b);
    /**
     * prodaction operation
     * @param a complex number 1
     * @param b complex number 2
     * @return result complex number
     */
    Complex product(Complex a, Complex b);
    /**
     * divide operation
     * @param a complex number 1
     * @param b complex number 2
     * @return result complex number
     */

    Complex divide(Complex a, Complex b);
}
