package geometry2d;

import Exceptions.AreaException;
import Exceptions.NegatiValueException;

public class Rectangle implements Figure {

    static double length;
    static double height;

    public Rectangle(double len, double heig) {
        if (len < 0 || heig < 0) {
            throw new NegatiValueException("The sides is specified incorrectly");
        }

        length = len;
        height = heig;
    }

    @Override
    public double area() {
        double result = length * height;

        if (result <= 0) {
            throw new AreaException("Area less than or equal to zero");
        }

        return result;
    }

    @Override
    public String toString() {
        return String.valueOf((length + height) * 2);
    }
}