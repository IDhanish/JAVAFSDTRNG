package com.ust.examples;
class Animal{
	String name;
	public void eat() {
		System.out.println("i can eat");
	}
}
class Dog extends Animal{
	public void display() {
		System.out.println("my name is "+name);
	}
}
public class Example28 {

	public static void main(String[] args) {
		Dog labrador=new Dog();
		labrador.name="Arjun";
		labrador.display();
		labrador.eat();

	}

}
