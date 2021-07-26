package com.ust.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection5 {

	public static void main(String[] args) {
		List list=Arrays.asList("One Two Three Four Five Six One Three Four".split(" "));
		System.out.println("List:"+list);
		List sublist=Arrays.asList("Three Four".split(" "));
		System.out.println("SubList:"+sublist);
		System.out.println("IndexOfSubList:"+Collections.indexOfSubList(list, sublist));
		System.out.println("LastIndexOfSubList:"+Collections.lastIndexOfSubList(list, sublist));
	}

}
