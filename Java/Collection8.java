package com.ust.examples;

import java.util.HashSet;
import java.util.Iterator;

public class Collection8 {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("Geeks");
		hs.add("for");
		hs.add("Geeks");
		hs.add("is");
		hs.add("Very");
		hs.add("Helpful");
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
