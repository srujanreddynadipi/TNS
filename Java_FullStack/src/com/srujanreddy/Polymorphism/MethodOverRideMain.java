package com.srujanreddy.Polymorphism;

public class MethodOverRideMain {
    public static void main(String[] args) {
        // Reference of parent, object of child (runtime polymorphism)
        MethodOverRide d = new Demo1();  
        d.demo();  // ✅ correctly calls overridden method
    }
}
