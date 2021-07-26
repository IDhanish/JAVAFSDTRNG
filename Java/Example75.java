package com.ust.examples;

public class Example75 {
	public static void main(String[] args) {
		try {
			Example75 met=new Example75();
			System.out.println("length of JUNK is "+met.getStringSize("JUNK"));
			System.out.println("length of WRONG is "+met.getStringSize("WRONG"));
			System.out.println("length of null string is "+met.getStringSize(null));
		}catch(Exception ex) {
			System.out.println("Exception message:"+ex.getMessage());
			
		}

	}
	public int getStringSize(String str)throws Exception{
		if(str==null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
