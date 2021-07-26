package com.ust.examples;

public class Example54 {
void outerMethod() {
	System.out.println("Inside Outer Method");
class Inner{
	void innerMethod() {
		System.out.println("Inside Inner Method");
	}
}
	Inner y=new Inner();
	y.innerMethod();
}
	public static void main(String[] args) {
		Example54 outer=new Example54();
		outer.outerMethod();
	}

}
