package com.srujanreddy.Polymorphism;

// Parent class
public class MethodOverRide {
    public void demo() {
        System.out.println("this is parent class Method");
    }
}

// Child class
class Demo1 extends MethodOverRide {
    @Override
    public void demo() {
        System.out.println("this is derived class Method");
    }
}
