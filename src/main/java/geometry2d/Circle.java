package geometry2d;

import Exceptions.AreaException;
import Exceptions.NegatiValueException;

public class Circle implements Figure {
    static double radius;

    public Circle(double R) {
        if (R < 0) {
            throw new NegatiValueException("The radius is specified incorrectly");
        }
        radius = R;
    }

    @Override
    public double area() {
        double result = Math.PI * radius * radius;

        if (result <= 0) {
            throw new AreaException("Area less than or equal to zero");
        }

        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(radius);
    }
}
