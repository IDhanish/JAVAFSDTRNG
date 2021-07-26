package com.ust.examples;
//upcasting and downcasting
public class Example47 {

	public static void main(String[] args) {
		double num=15.678;
		System.out.println(num);
		int n=(int)num;//downcasting the double type to int type
		System.out.println(n);
		int x=75;
		double y=x;
		System.out.println(x);
		System.out.println(y);
		float f=(float)3.26;
		byte d=(byte)f;
		System.out.println(d);
		long e=1964;
		float j=(float)e;
		System.out.println(j);
		int c=4;
		String dbValue=String.valueOf(c);
		System.out.println(dbValue);
		dbValue=String.valueOf(e);
		System.out.println(dbValue);
		dbValue=String.valueOf(num);
		System.out.println(dbValue);
		
	}

}
