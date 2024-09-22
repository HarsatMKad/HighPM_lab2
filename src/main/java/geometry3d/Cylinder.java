package geometry3d;

import Exceptions.AreaException;
import Exceptions.NegatiValueException;
import geometry2d.Circle;
import geometry2d.Figure;

public class Cylinder {
    static Figure base;
    static double height;

    public Cylinder(double radius, double heig){

        if (radius < 0 || heig < 0) {
            throw new NegatiValueException("The radius is specified incorrectly");
        }

        base = new Circle(radius);
        height = heig;
    }

    public double volume(){
        double result = base.area() * height;

        if (result <= 0) {
            throw new AreaException("Area less than or equal to zero");
        }

        return result;
    }
}
