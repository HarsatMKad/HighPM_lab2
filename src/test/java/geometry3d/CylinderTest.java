package geometry3d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cylinder = new Cylinder(3, 2);

    @Test
    void volume() {
        assertEquals( Math.PI*3*3*2, cylinder.volume());
    }
}