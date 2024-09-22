package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenSeparator {
    static ArrayList<Integer> evenList = new ArrayList<>();
    static ArrayList<Integer> oddList = new ArrayList<>();

    void addNumber(int number) {
        if(number % 2 == 0){
            evenList.add(number);
        } else {
            oddList.add(number);
        }
    }

    String even(){
        return evenList.toString();
    }

    String odd(){
        return oddList.toString();
    }
}
