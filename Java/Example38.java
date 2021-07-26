package com.ust.examples;
abstract class Emplo{
	private String name;
	private int Emplohour;
	void display() {
		System.out.println("Name is "+name+"\n"+"Employee hour is "+Emplohour);
	}
	public Emplo() {
		
	}
	public Emplo(String name,int Emplohour) {
		this.name=name;
		this.Emplohour=Emplohour;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setEmploHour(int emplohour) {
		this.Emplohour=Emplohour;
	}
	public int getEmploHour() {
		return Emplohour;
	}
	abstract void salary(int x,int y);
}
public class Example38 extends Emplo {
	Example38(){
		super();
	}
	Example38(String name,int Emplohour){
		super(name,Emplohour);
	}
	void salary(int days,int total_sal) {
		if((total_sal/days)>500) {
			System.out.println("The pay is good");
		}
		else {
			System.out.println("The pay is not Good");
		}
	}

	public static void main(String[] args) {
		Example38 e=new Example38("Dhanish",22);
		e.display();
		Example38 e1=new Example38();
		e1.setname("hari");
		System.out.println(e1.getname());
		e1.salary(10,10000);
		
		

	}

}
