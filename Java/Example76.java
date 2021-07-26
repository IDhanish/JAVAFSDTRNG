package com.ust.examples;

public class Example76 extends Exception {
	static String msg="error";
	Example76(String message){
		super(message);
	}
	public static void main(String[] args)throws Example76 {
		if(msg.equals("error")) {
			System.out.println("error message");
		}else
				throw new Example76("BankException");

	}

}
