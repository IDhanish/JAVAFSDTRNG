package com.ust.examples;
/*
 * another abstract example
 */
abstract class Vehicle{
	int x=5;
	Vehicle(){
		System.out.println("Vehicle class constructor");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Automatic variant");
	}
}
class Honda extends Vehicle{
	void run() {
		System.out.println("Vehicle run successfully");
	}
	void changeGear() {
		System.out.println("Automatic variant in subclass");
		super.changeGear();
	}
}
public class Example35 {

	public static void main(String[] args) {
		Vehicle v=new Honda();
		System.out.println(v.x);
		v.run();
		v.changeGear();

	}

}
