package com.ust.examples;
/*
 * about strings
 */
public class Example9 {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		str="hi";
		System.out.println(str1);
		
		System.out.println(str.concat(str1));
		System.out.println(str.charAt(1));
		//System.out.println(str.compareTo(str1));
		//System.out.println(str.indexOf(1));
		System.out.println(str.length());
		System.out.println(str1.substring(3));
		System.out.println(str.trim());
		System.out.println(str.valueOf(false));
		System.out.println(str.isEmpty());
		System.out.println(str.join(str1, "danish "," how are you"));
	}

}
