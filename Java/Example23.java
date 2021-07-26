package com.ust.examples;

public class Example23 {
	String web;
	Example23(String w){
		web=w;
	}
	Example23(Example23 cc){
		web=cc.web;
	}
	void disp() {
		System.out.println("Constructor:"+web);
	}
	public static void main(String[] args) {
	Example23 obj1=new Example23("Example of Copy Constructor in Java");
	Example23 obj2=new Example23(obj1);
	obj1.disp();
	obj2.disp();

	}

}
