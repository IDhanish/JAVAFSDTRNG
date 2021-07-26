package com.ust.examples;
interface Emp1
{
	int eid=2101;
	void geteid();
}
class Example61{
	public static void main(String[] args) {
		Emp1 ob=new Emp1(){
			@Override
			public void geteid() {
				System.out.println("Employee id is "+eid);
			}
		};
		ob.geteid();
		
	}
}