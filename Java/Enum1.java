package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enum1 {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		Hashtable<String,String>hashtable=new Hashtable<String,String>();
		hashtable.put("key1", "balu");
		hashtable.put("key2","hari");
		hashtable.put("key3","anand");
		hashtable.put("key4","dhanish");
		hashtable.put("key5","sreehari");
		names=hashtable.keys();
		while(names.hasMoreElements()) {
			key=(String)names.nextElement();
			System.out.println("Key: "+key+" &Value:"+hashtable.get(key));
		}
	}

}
