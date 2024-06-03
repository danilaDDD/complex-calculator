package model.repository.impl;


import logging.Log;
import model.Complex;
import model.repository.ComplexRepository;

import java.util.logging.Logger;

public class LoggableComplexRepository implements ComplexRepository {
    Logger logger;
    ComplexRepository repository;

    public LoggableComplexRepository(ComplexRepository repository) {
        this.repository = repository;
        this.logger = Log.log(getClass().getName());
    }

    @Override
    public Complex plus(Complex a, Complex b) {
        logger.info(String.format("Суммирую %s и %s", a, b));
        Complex result = repository.plus(a, b);
        logger.info(String.format("Результат: %s", result));

        return result;
    }

    @Override
    public Complex minus(Complex a, Complex b) {
        logger.info(String.format("Вычитаю %s и %s", a, b));
        Complex result = repository.minus(a, b);
        logger.info(String.format("Результат: %s", result));

        return result;
    }

    @Override
    public Complex product(Complex a, Complex b) {
        logger.info(String.format("Умножаю %s и %s", a, b));
        Complex result = repository.product(a, b);
        logger.info(String.format("Результат: %s", result));

        return result;
    }

    @Override
    public Complex divide(Complex a, Complex b) {
        logger.info(String.format("Делю %s и %s", a, b));
        Complex result = repository.divide(a, b);
        logger.info(String.format("Результат: %s", result));

        return result;
    }
}
