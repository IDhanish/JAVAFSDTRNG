package com.ust.examples;
class Base1{
final void foo(int i) {
		System.out.println(i);
	}
	void foo(int i,String s) {
		System.out.println(i+s);
	}}
class Child extends Base1{
	void foo(int i,String s) {
		System.out.println(i+" "+s);
	}
}
public class Example44{
	public static void main(String[] args) {
		Child c=new Child();
		c.foo(14);
		c.foo(14,"Dhanish");
	}
}
