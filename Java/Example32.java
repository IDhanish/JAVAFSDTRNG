package com.ust.examples;
class Super_class{
	int num=20;
	public void display() {
		System.out.println("This is the display method of superclass");
	}
}
public class Example32 extends Super_class {
	int num=10;
	public void display() {
		System.out.println("This is the display method of subclass");
	}
	public void my_method() {
		Example32 sub=new Example32();
		sub.display();
		super.display();
		System.out.println("The value of the variable named num in subclass:"+sub.num);
		System.out.println("The value of the variable named num in superclass:"+super.num);
	}

	public static void main(String[] args) {
		Example32 obj=new Example32();
		obj.my_method();
	}

}
