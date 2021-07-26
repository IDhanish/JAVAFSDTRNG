package com.ust.examples;
interface Firstinterface{
	public void myMethod();
}
interface Secondinterface{
	public void myOtherMethod();
	}
	class DemoClass1 implements Firstinterface,Secondinterface{
		public void myMethod() {
			System.out.println("Some text...");
		}
		public void myOtherMethod() {
			System.out.println("Some Other text...");
		}
	}
public class Example64 {

	public static void main(String[] args) {
		DemoClass1 myObj=new DemoClass1();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
