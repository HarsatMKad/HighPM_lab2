package org.example;

public class Bell {
    static boolean soundKey = false;

    String sound() {
        if (soundKey) {
            soundKey = false;
            return "dong";
        } else {
            soundKey = true;
            return "ding";
        }
    }
}