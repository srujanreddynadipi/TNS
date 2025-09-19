package com.srujanreddy.interfaces;

public interface Interface {
	int a =10;
	void show();
}

class sample implements Interface{
	public void show() {
		System.out.println("this is implementation");
	}
}