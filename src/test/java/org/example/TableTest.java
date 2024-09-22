package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table = new Table(3, 2);

    @Test
    void getValue() {
        int value = 5;
        table.setValue(2, 1, value);

        assertEquals(value, table.getValue(2, 1));
    }

    @Test
    void rows() {
        assertEquals(3, table.rows());
    }

    @Test
    void cols() {
        assertEquals(2, table.cols());
    }

    @Test
    void testToString() {
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);
        table.setValue(2, 0, 5);
        table.setValue(2, 1, 6);
        String correctResult = "[1, 2][3, 4][5, 6]";
        assertEquals(correctResult, table.toString());
    }

    @Test
    void average() {
        table.setValue(0, 0, 2);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 2);
        table.setValue(1, 1, 5);
        table.setValue(2, 0, 5);
        table.setValue(2, 1, 5);
        assertEquals(3.5, table.average());
    }
}