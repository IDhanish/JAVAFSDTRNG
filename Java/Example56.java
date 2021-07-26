package com.ust.examples;

public class Example56 {
static class Nested_Demo {
	public void my_method() {
		System.out.println("This is my nested class");
	}
}
	public static void main(String[] args) {
		Example56.Nested_Demo nested=new Example56.Nested_Demo();
		nested.my_method();

	}

}
