package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> evenList = new LinkedList<>();
    private List<Integer> oddList = new ArrayList<>();

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
