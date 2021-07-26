package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(2);
		arr.add(4.2f);
		arr.add("hai");
		System.out.println(arr);
		arr.remove(1);
		arr.add(2, "hello");
		System.out.println(arr);
		ArrayList<Integer>x=new ArrayList<Integer>();
		x.add(4);
		x.add(10);
		x.add(1);
		x.add(0);
		Collections.sort(x);
		int y=4;
		System.out.println(x);
		for(int i=0;i<x.size();i++) {
			if(x.get(i)==y){
				System.out.println("exists");
				System.out.println("index is "+i);
			}
		}
	}

}
