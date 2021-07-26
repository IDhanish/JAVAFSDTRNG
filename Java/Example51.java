package com.ust.examples;
/*
 * inner class
 */
public class Example51 {
	int x=5;
	private void display() {
		System.out.println("outer class");
	}
	private class Inner{
		int y;
		Inner(int y){
			this.y=y;
		}
		void display() {
		System.out.println("Example of inner class");
	}
		}
	public static void main(String[] args) {
		Example51.Inner e1=new Example51().new Inner(6);
		Example51 e2=new Example51();
		e2.display();
		e2.x=5;
		e1.display();
		System.out.println(e2.x);
		e1.display();

	}

}
