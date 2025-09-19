package com.srujanreddy.abstraction;

public abstract class Abstraction {
	abstract void show();
	    
	public void demo() {
		
		System.out.println("this is method ");
	}
}

 class  abstract1 extends Abstraction{
	public void show () {
		System.out.println("");
	}
}