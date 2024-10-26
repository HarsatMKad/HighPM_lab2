package org.example;

public class Balance {
    private int rightBowl;
    private int leftBowl;

    void addRight(int number) {
        rightBowl += number;
    }

    void addLeft(int number) {
        leftBowl += number;
    }

    String result(){
        if(rightBowl == leftBowl){
            return "=";
        } else if(rightBowl > leftBowl){
            return "R";
        } else {
            return "L";
        }
    }
}
