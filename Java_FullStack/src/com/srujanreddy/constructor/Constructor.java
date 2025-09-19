package com.srujanreddy.constructor;

class sample {
    int x = 1, y = 2, z = 3;

    sample() {
        System.out.println("this is constructor");
    }

    public void show() {
        int volume = x * y * z;
        System.out.println(volume);
    }
}

public class Constructor {
    public static void main(String[] args) {
        sample s = new sample(); // object creation
        s.show();                // method call
    }
}
