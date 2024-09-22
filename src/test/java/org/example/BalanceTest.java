package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void result() {
        Balance balance = new Balance();

        balance.addLeft(1);
        assertEquals("L", balance.result());

        balance.addRight(2);
        assertEquals("R", balance.result());

        balance.addLeft(1);
        assertEquals("=", balance.result());
    }
}