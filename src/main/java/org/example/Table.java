package org.example;

import java.util.Arrays;

public class Table {
    static int[][] numberMatrix;

    Table(int rows, int cols) {
        numberMatrix = new int[rows][cols];

        for (int[] rowList : numberMatrix) {
            for (int number : rowList) {
                number = 0;
            }
        }
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
        String returnString = "";

        for (int[] rowList : numberMatrix) {
            returnString += Arrays.toString(rowList);
        }

        return returnString;
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