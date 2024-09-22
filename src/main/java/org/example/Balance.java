package org.example;

public class Balance {
    static int rightBowl = 0;
    static int leftBowl = 0;

    void addRight(int number) {
        rightBowl += number;
    }

    void addLeft(int number) {
        leftBowl += number;
    }

    String result(){
        if(rightBowl == leftBowl){
            return "=";
        }
        if(rightBowl > leftBowl){
            return "R";
        } else {
            return "L";
        }
    }
}
