package org.example;

public class Bell {
    private boolean soundKey;

    public void sound() {
        if (soundKey) {
            soundKey = false;
            System.out.println("dong");
        } else {
            soundKey = true;
            System.out.println("ding");
        }
    }
}