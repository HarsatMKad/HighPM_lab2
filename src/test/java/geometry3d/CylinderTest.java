package geometry3d;

import geometry2d.Circle;
import geometry2d.Figure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Figure circle = new Circle(3);

    Cylinder cylinder = new Cylinder(circle, 2);

    @Test
    void volume() {
        assertEquals( Math.PI*3*3*2, cylinder.volume());
    }
}