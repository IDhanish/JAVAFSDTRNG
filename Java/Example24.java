package com.ust.examples;
import java.io.*;
class Student{
String name;
int id;
Student(String name,int id)
{
	this.name=name;
	this.id=id;
}
}
public class Example24 {

	public static void main(String[] args) {
		Student student1=new Student("balu",101);
		System.out.println("Student Name:"+student1.name+" and Student id:"+student1.id);

	}

}
