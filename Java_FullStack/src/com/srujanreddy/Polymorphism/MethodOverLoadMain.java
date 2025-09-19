package com.srujanreddy.Polymorphism;

public class MethodOverLoadMain {
		public static  void main (String [] args ) {
			MethodOverLoad m = new MethodOverLoad();
			m.hello();
			m.hello(2);
			m.hello(2.8f);
			
			m.hello(1,2.9f);
			m.hello(2.7f,3);
		}
}
