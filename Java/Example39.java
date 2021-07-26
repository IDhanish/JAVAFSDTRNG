package com.ust.examples;
/*
 * Final class,Final method,Final variable
 */
public class Example39 {
	int a;
	final int b;
	Example39(){
		a=7;
		b=2;
	}
	
	
	public static void main(String[] args) {
		final int x;//x is alocal variable and is also made final
		x=10;
		System.out.println(x);
		Example39 e=new Example39();
		System.out.println(e.a);
		System.out.println(e.b);
		e.a=3;
		System.out.println(e.a);
	}

}
