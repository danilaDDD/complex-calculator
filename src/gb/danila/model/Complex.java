package gb.danila.model;

public class Complex {
    private final double real;
    private final double image;

    public Complex(double real, double image) {
        this.image = image;
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public double getReal() {
        return real;
    }

    public double getAbs(){
        return Math.sqrt(real * real + image * image);
    }

    @Override
    public String toString() {
        double real = getReal();
        double image = getImage();

        char separator;
        if(image < 0){
            image = -image;
            separator = '-';
        }else
            separator = '+';

        String imageString = image == 1d ? "": String.valueOf(image);

        return String.format("%s %s i%s", real, separator, imageString);
    }
}
