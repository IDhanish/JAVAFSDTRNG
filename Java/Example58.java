
package com.ust.examples;

public class Example58 {
private int data=30;
void display() {
	int value=50;
	class Local{
		void msg() {
			System.out.println(value);
		}
	}
	Local l=new Local();
	l.msg();
}
public static void main(String[] args) {
	Example58 obj=new Example58();
	obj.display();
}
}
