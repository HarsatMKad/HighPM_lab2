package org.example;

public class Button {
    static int clickCount = 0;

    int click(){
        clickCount++;
        return clickCount;
    }
}
