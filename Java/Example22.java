package com.ust.examples;

public class Example22 {
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	Example22(String a,String b,String c,String d,String e,float f){
		fName=a;
		lName=b;
		city=c;
		address=d;
		dob=e;
		salary=f;
		
		
	}
	void display(){
		System.out.println(fName+"	"+lName+"	"+city+"	"+address+"	"+dob+"	"+salary);
	}
	public static void main(String[] args) {
	Example22 e1=new Example22("hari","krishnan","trissur","street","10-june-2000",30000.0f);
	Example22 e2=new Example22("anand","krishnan","trissur","street","10-june-2001",50000.0f);
	Example22 e3=new Example22("balu","krishnan","trissur","street","10-june-2002",55000.0f);
	Example22 e4=new Example22("sree","hari","trissur","street","10-june-2003",27000.0f);
	Example22 e5=new Example22("balu","kumar","trissur","street","10-june-2004",45000.0f);
	Example22 array[]=new Example22[5];
	array[0]=new Example22("hari","krishnan","trissur","street","10-june-2000",30000.0f);
	array[1]=new Example22("anand","krishnan","trissur","street","10-june-2001",50000.0f);
	array[2]=new Example22("balu","krishnan","trissur","street","10-june-2002",55000.0f);
	array[3]=new Example22("sree","hari","trissur","street","10-june-2003",27000.0f);
	array[4]=new Example22("balu","kumar","trissur","street","10-june-2004",45000.0f);
	for(Example22 e:array) {
		//System.out.println(e.fName+e.lName+e.city+e.address+e.dob+e.salary);
		e.display();
	}
	/*e1.display();
	e2.display();
	e3.display();
	e4.display();
	e5.display();*/
	

	}

}
