package com.ust.examples;
import java.util.ArrayList;
import java.util.Collections;
class Student3 implements Comparable<Student3>{
	int rollno;
	String name;
	int age;
	Student3(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student3 st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}
public class Comparable1 {

	public static void main(String[] args) {
		ArrayList<Student3>al=new ArrayList<Student3>();
		al.add(new Student3(101,"Balu",24));
		al.add(new Student3(106,"Hari",23));
		al.add(new Student3(105,"Dhanish",22));
		Collections.sort(al);
		for(Student3 st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			
		}
	}

}
