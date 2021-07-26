package com.ust.examples;

public class Example55 {
class Inner1{
	public void show() {
		System.out.println("In a nested class method");
	}
}
	public static void main(String[] args) {
		Example55.Inner1 in=new Example55().new Inner1();
		in.show();
	}

}
