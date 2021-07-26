package com.ust.examples;

public class Example3 {

	public static void main(String[] args) {
String[] str= {"dhanish","anand","hari","balu","sreehari"};
for(int i=0;i<str.length;i++) {
	if(str[i].equals("hari"))
		continue;
	System.out.println(str[i]);
}


	}

}
