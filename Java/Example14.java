package com.ust.examples;
class TestExample{
	int id;
	String name;
	float salary;
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {System.out.println(id+""+name+""+salary);}
	}
public class Example14 {
	public static void main(String[] args) {
		TestExample e1=new TestExample();
		TestExample e2=new TestExample();
		TestExample e3=new TestExample();
		e1.insert(101,"\tanand\t",45000);
		e2.insert(102,"\tbalu\t",25000);
		e3.insert(103,"\tanand\t",55000);
		e1.display();
		e2.display();
		e3.display();
	}

}

	
