package com.ust.examples;
//abstract example
abstract class Animals{
	abstract void makeSound();
}
class Dogs extends Animals{
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}
class Cat extends Animals{
	public void makeSound() {
		System.out.println("Meow Meow");
	}
}
class Example36 {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		d1.makeSound();
		Cat c1=new Cat();
		c1.makeSound();
}

}
