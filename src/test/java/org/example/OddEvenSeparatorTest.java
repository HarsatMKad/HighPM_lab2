package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {
    OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

    @Test
    void even() {
        oddEvenSeparator.addNumber(2);
        oddEvenSeparator.addNumber(4);
        oddEvenSeparator.addNumber(6);
        assertEquals("[2, 4, 6]", oddEvenSeparator.even());
    }

    @Test
    void odd() {
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(9);
        assertEquals("[5, 9]", oddEvenSeparator.odd());
    }
}