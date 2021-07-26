package com.ust.examples;
class GenericsClass1<T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generic class");
	}
}
public class Collection14 {

	public static void main(String[] args) {
	GenericsClass1<Integer>obj=new GenericsClass1<>();
	obj.display();
	}

}
