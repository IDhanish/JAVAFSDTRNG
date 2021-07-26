package com.ust.examples;
class DemoClasss{
	public <T> void genericsMethod(T data){
		System.out.println("Generics Method:");
		System.out.println("Data Passed:"+data);
	}

}

public class Collection13 {

	public static void main(String[] args) {
		DemoClasss demo=new DemoClasss();
		demo.<String>genericsMethod("Java programming");
		demo.<Integer>genericsMethod(25);
	}
}
