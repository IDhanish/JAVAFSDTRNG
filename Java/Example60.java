package com.ust.examples;
interface Emp
{
	int eid=2101;
	void geteid();
}
class ImplClass implements Emp
{
	@Override
	public void geteid() {
		System.out.println("Employee id is "+eid);
	}
}
public class Example60 {

	public static void main(String[] args) {
		ImplClass ob=new ImplClass();
		ob.geteid();

	}

}
