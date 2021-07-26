package com.ust.examples;
/*
 * final example
 */
class Vehicle1{
	int x=5;
	Vehicle1(){
		System.out.println("Vehicle class constructor");
	}
	
	final void changeGear() {
		System.out.println("Automatic variant");
	}
}
class Honda1 extends Vehicle1{
	
	void changeGear1() {
		System.out.println("Automatic variant in subclass");
		super.changeGear();
	}
}
public class Example40 {

	public static void main(String[] args) {
		Vehicle1 v=new Honda1();
		System.out.println(v.x);
		Honda1 h=new Honda1();
		h.changeGear1();
		v.changeGear();

	}

}
