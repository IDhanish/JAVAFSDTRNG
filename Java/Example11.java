package com.ust.examples;

import java.io.File;
import java.io.IOException;

/*
 * file operations
 */
public class Example11 {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\ustjava06\\Sample.txt");
		try{if(f.createNewFile()) {
			System.out.println("new file is created");
		}
		else {
			System.out.println("file already exists");
		}}
		catch(IOException e) {
			System.out.println(e);}
		}

	}
