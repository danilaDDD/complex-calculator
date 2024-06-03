package view;

import controller.CalculatorController;
import exception.CommandNotFoundException;
import exception.ComplexFormatException;
import model.Complex;
import util.parser.ComplexParser;
import model.repository.ComplexRepository;
import model.repository.impl.ComplexRepositoryImpl;
import model.repository.impl.LoggableComplexRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalculatorView {

    public static void runView(){
        ComplexRepository repository = new LoggableComplexRepository(new ComplexRepositoryImpl());
        CalculatorController calculatorController = new CalculatorController(repository);
        CalculatorView view = new CalculatorView(calculatorController);
        view.run();
    }

    private  final Map<String, BinaryOperator<Complex>> operatorInvoker;

    private final CalculatorController calculatorController;

    public CalculatorView(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;

        operatorInvoker = Map.of(
                "+", calculatorController::plus,
                "-", calculatorController::minus,
                "*", calculatorController::product,
                "/", calculatorController::divide
        );
    }

    public void run(){
        while (true) {
            try {
                prompt();
            } catch (CommandNotFoundException | ComplexFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void prompt() throws CommandNotFoundException, ComplexFormatException {
        Scanner scanner = new Scanner(System.in);
        ComplexParser parser = new ComplexParser();

        System.out.print("Enter complex number 1 for example 1 + i2.0 or 1 - i: ");
        Complex a = parser.parseComplex(scanner.nextLine());

        System.out.print("Enter operation + - * /: ");
        String operation = scanner.nextLine();
        BinaryOperator<Complex> invoking = operatorInvoker.get(operation);
        if(invoking == null)
            throw new CommandNotFoundException(operation);

        System.out.print("Enter complex number 2 for example 1 + i2.0 or 1 - i: ");
        Complex b = parser.parseComplex(scanner.nextLine());


        System.out.println(invoking.apply(a, b));
    }
}

