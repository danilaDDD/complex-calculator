package gb.danila.parser;

import gb.danila.exception.ComplexFormatException;
import gb.danila.model.Complex;

public class ComplexParser {
    public Complex parseComplex(String prompt) throws ComplexFormatException {
        String separator;
        if(prompt.contains("+"))
            separator = "\\+";
        else if (prompt.contains("-"))
            separator = "-";
        else
            throw new ComplexFormatException("separator + or - not found");

        if(prompt.length() <= 1)
            throw new ComplexFormatException("prompt length must be greater 1 characters");

        String[] parts = prompt.split(separator);

        String realString = parts[0].strip();
        String imageString = parts[1].strip();
        if(imageString.charAt(0) != 'i')
            throw new ComplexFormatException("image part must found i char");

        imageString = imageString.substring(1);
        if(imageString.isEmpty())
            imageString = "1";

        double real, image;
        try{
            real = Double.parseDouble(realString);
            image = Double.parseDouble(imageString);
        }catch (NumberFormatException e){
            throw new ComplexFormatException(e.getMessage());
        }

        if(separator.equals("-"))
            image = - image;

        return new Complex(real, image);

    }
}
