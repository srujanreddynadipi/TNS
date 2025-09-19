package com.srujanreddy.Polymorphism;

public class MethodOverLoad {
	public void hello() {
		System.out.println("this is 0 parameter");
	}
	
	public void hello(int a ) {
		System.out.println("this is 1 parameter" + a);
		
	}
	
	public void hello(float a ) {
		System.out.println("this is 1 parameter" + a);
		
	}
	
	public void hello(int a , float b) {
		System.out.println("this is 2 parameter" + a+ b);
	}
	
	public void hello(float a , int b) {
		System.out.println("this is 2 parameter" + a+ b);
	}
	
	
	
}
