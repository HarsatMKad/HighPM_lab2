package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle(5, 10);

    @Test
    void area() {
        assertEquals(5*10, rectangle.area());
    }

    @Test
    void testToString() {
        assertEquals("30.0", rectangle.toString());
    }
}