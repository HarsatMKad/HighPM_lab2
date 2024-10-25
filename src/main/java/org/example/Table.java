package org.example;

import java.util.Arrays;

public class Table {
    private int[][] numberMatrix;

    Table(int rows, int cols) {
        numberMatrix = new int[rows][cols];
    }

    int getValue(int row, int col) {
        return numberMatrix[row][col];
    }

    void setValue(int row, int col, int value) {
        numberMatrix[row][col] = value;
    }

    int rows() {
        return numberMatrix.length;
    }

    int cols() {
        return numberMatrix[0].length;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();

        for (int[] rowList : numberMatrix) {
            returnString.append(Arrays.toString(rowList));
        }

        return returnString.toString();
    }

    double average() {
        double sumNumber = 0;

        for (int[] rowList : numberMatrix) {
            for (int number : rowList) {
                sumNumber += number;
            }
        }

        return sumNumber / (numberMatrix.length * numberMatrix[0].length);
    }
}