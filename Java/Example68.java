package com.ust.examples;
//Exception example
public class Example68 {

	public static void main(String[] args) {
		String s=null;
		//int x=5/0;
		try {
			try {
				System.out.println(s.length());
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("This code gets executed always");
			}
			int a[]=new int[5];
			a[6]=10;
		System.out.println(s.length());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}

}
