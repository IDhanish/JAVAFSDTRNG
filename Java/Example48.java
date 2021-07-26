package com.ust.examples;

import java.util.Scanner;

public class Example48 {

	public static void main(String[] args) {
		String s;
		char b;
		int x=10;
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter a string:");
		s=sc.nextLine();}
		System.out.println("vowels in string are");
		for(int i=0;i<s.length();i++) {
			b=s.charAt(i);
			switch(b) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':x=1;
			System.out.println(b);
			}
		}
	if(x==0) {
		System.out.println("There are no vowels in a string");
	}

}}
