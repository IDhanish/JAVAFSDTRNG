
package com.ust.examples;

public class Example57 {
private int data=30;
void display() {
	class Local{
		void msg() {
			System.out.println(data);
		}
	}
	Local l=new Local();
	l.msg();
}
public static void main(String[] args) {
	Example57 obj=new Example57();
	obj.display();
}
}
