package org.example;

public class Balance {
    private int rightBowl = 0;
    private int leftBowl = 0;

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
