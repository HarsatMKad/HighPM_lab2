package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void click() {
        Button button = new Button();
        assertEquals(1, button.click());
        assertEquals(2, button.click());
        assertEquals(3, button.click());
    }
}