package com.ust.examples;

public class Example4 {

	public static void main(String[] args) {
		String colorcode="yellow";
		switch(colorcode) {
		case "red":
			System.out.println("stop");
			break;
		case "greeen":
			System.out.println("go");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		default:
			System.out.println("go home");
			break;
		}

	}

}
