package com.srujanreddy.constructor;

class Box{
	int a,b,c;
	Box(int x , int y , int z){
		a=x;
		b=y;
		c=z;
		System.out.println("this is constructor");
	}
	
	public void VolumeBox() {
		int vol = a*b*c;
		System.out.println(vol);
	}
}

public class constructor2 {
	public void main (String [] args) {
    Box  b = new Box(10,20,30);
     b.VolumeBox();
	}
}
