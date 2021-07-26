package com.ust.examples;
/*
 * calculation is a superclass
 */
class Calculation{
	int z;
	public void addition(int x,int y) {
		z=x+y;
		System.out.println("The sum of the given numbers:"+z);
	}
	public void subtraction(int x,int y) {
		z=x-y;
		System.out.println("The difference of the given numbers:"+z);
	}
}
//Example 31 is a subclass
public class Example31 extends Calculation {
	public void multiplicatio(int x,int y) {
		z=x*y;
		System.out.println("The product of the given numbers:"+z);
	}

	public static void main(String[] args) {
		int a=20,b=10;
		Example31 e=new Example31();
		e.addition(a, b);
		e.subtraction(a, b);
		e.multiplicatio(a, b);

	}

}
