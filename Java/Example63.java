package com.ust.examples;
interface Animal1{
	public void animalSound();
	public void sleep();
}
class Pig implements Animal1 {
public void animalSound() {
	System.out.println("The pig says:wee wee");
}
public void sleep() {
	System.out.println("Zzz");
}
}
class Example63{
	public static void main(String[] args) {
		Pig myPig=new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}
