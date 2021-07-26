package com.ust.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection9 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("Geeks");
		ts.add("for");
		ts.add("Geeks");
		ts.add("is");
		ts.add("Very helpful");
		Iterator<String>itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
