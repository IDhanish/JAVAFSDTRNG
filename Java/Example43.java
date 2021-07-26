package com.ust.examples;

class Config{
	final static String name="CONFIG";
	final long initTime;
	Config(){
		this.initTime=System.currentTimeMillis();
	}}
	public class Example43 {
	public static void main(String[] args) {
		Config c=new Config();
		System.out.println(c.initTime);
		Config c1=new Config();
		System.out.println(c1.initTime);

	}
	}


