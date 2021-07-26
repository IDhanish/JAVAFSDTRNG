package com.ust.examples;
class Base{
	final void display() {
		System.out.println("Base method called");
	}
}
class Derived extends Base{
	void display1() {
		System.out.println("Base method called");
	}
}
class Example41 {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.display();
		d.display1();
	}

}
