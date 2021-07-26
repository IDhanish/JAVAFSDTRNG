package com.ust.examples;
//about abstract class
abstract class Car{
	int x;
	abstract void insurance_Details();
	void display() {
		
	}
	
	
	
}








public class Example33 extends Car{
	void insurance_Details() {
		System.out.println("please provide the insurance details:");
	}

	public static void main(String[] args) {
		//Car c=new Car();
		Example33 e=new Example33();
		Car c=new Example33();
		c.insurance_Details();
		e.insurance_Details();
	

	}

}
